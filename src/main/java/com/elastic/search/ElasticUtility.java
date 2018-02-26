package com.elastic.search;

import java.util.Collections;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.entity.ContentType;
import org.apache.http.nio.entity.NStringEntity;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.json.JSONArray;
import org.json.JSONObject;

public class ElasticUtility {

	public void updateIndex(JSONObject jsonObject, String row_key, String tableName)
			throws Exception, ElasticSearchConnectionException {

		RestClient client = null;

		try {

			String endpoint = Constant.ELASTIC_URL + "/" + tableName + "/" + Constant.DATA + "/" + row_key + "/"
					+ Constant._UPDATE;

			client = RestClient.builder(new HttpHost("localhost", 9200, "http")).build();
			JSONObject jsonObj = new JSONObject();
			jsonObj.put(Constant.DOC_AS_UPSERT, true);
			jsonObj.put(Constant.DOC, jsonObject);

			HttpEntity entity = new NStringEntity(jsonObj.toString(), ContentType.APPLICATION_JSON);
			Response response = client.performRequest(Constant.POST, endpoint, Collections.<String, String>emptyMap(),
					entity);

			System.out.println(response.toString());
		} finally {

			if (client != null) {
				client = null;
			}

		}

	}

	public void updateBulkIndex(JSONArray array, String tableName) throws Exception, ElasticSearchConnectionException {

		System.out.println("Start Bulk Update for table: "+tableName);
		RestClient client = null;
		try {
			String endpoint = Constant.ELASTIC_URL + "/" + tableName + "/" + Constant.DATA + "/" + Constant._BULK;

			client = RestClient.builder(new HttpHost("localhost", 9200, "http")).build();

			HttpEntity entity = new NStringEntity(convertJsonArrayToString(array,tableName), ContentType.APPLICATION_JSON);
			Response response = client.performRequest(Constant.POST, endpoint, Collections.<String, String>emptyMap(),
					entity);
			System.out.println(response.toString());
			System.out.println("Finished Bulk Update for table: "+tableName);

		} finally {
			if (client != null) {
				client = null;
			}
		}

	}

	public void deleteDocument(String tableName) throws Exception, ElasticSearchConnectionException {

		RestClient client = null;
		try {
			String endpoint = Constant.ELASTIC_URL + "/" + tableName;

			client = RestClient.builder(new HttpHost("localhost", 9200, "http")).build();

			HttpEntity entity = new NStringEntity("", ContentType.TEXT_PLAIN);
			Response response = client.performRequest(Constant.DELETE, endpoint, Collections.<String, String>emptyMap(),
					entity);
			System.out.println(response.toString());
		} finally {
			if (client != null) {
				client = null;
			}
		}
	}

	public JSONObject getDataFromElastic(String tableName,JSONObject userQuery) throws Exception, ElasticSearchConnectionException {

		RestClient client = null;
		Boolean rawData = false;
		try {
			/*String endpoint = propertyReader.getProperty(Constant.ELASTIC_SEARCH_PROTOCOL) + "://"
					+ propertyReader.getProperty(Constant.ELASTIC_SEARCH_HOST) + ":"
					+ Integer.parseInt(propertyReader.getProperty(Constant.ELASTIC_SEARCH_PORT)) + "/" + endPoint + "/_search";*/
			
			String endpoint =  Constant.ELASTIC_URL + "/" + tableName + "/" + Constant.SEARCH_QUERY + "?" + Constant.IS_PRETTY ;
			
			client = RestClient.builder(new HttpHost("localhost",
					9200,
					"http")).build();
			if(userQuery.has("rawOutput")){
				rawData = userQuery.getBoolean("rawOutput");
				userQuery.remove("rawOutput");
			}
			HttpEntity entity = new NStringEntity(userQuery.toString(), ContentType.APPLICATION_JSON);

			Response performRequest = client.performRequest(Constant.GET, endpoint, Collections.<String, String>emptyMap(),
					entity);
			Response response = performRequest;

			if(rawData){
				return new JSONObject().put(Constant.DATA, new JSONArray().put(new JSONObject(EntityUtils.toString(response.getEntity()))));
			}
			else{
				String jsonResponse = EntityUtils.toString(response.getEntity());
				System.out.println(jsonResponse);
				return new JSONObject(jsonResponse);
			}
			
		} finally {
			if (client != null) {
				client = null;
			}
		}
	}
	
	public JSONObject getElasticResponse(JSONObject response) {

		try {

			JSONObject responseObject = new JSONObject();
			JSONArray outputArray = new JSONArray();

			String countFieldName = Constant.COUNT;

			JSONObject meta = new JSONObject();
			if (response.has(Constant.AGGREGATIONS)) {
				getAggregationResult(response.getJSONObject(Constant.AGGREGATIONS), outputArray, countFieldName, meta);
			} else {
				JSONObject hits = response.getJSONObject(Constant.HITS);

				int totalHits = hits.getInt(Constant.TOTAL);

				if (totalHits > 0) {

					JSONArray resultArray = hits.getJSONArray(Constant.HITS);
					responseObject.put(Constant.TOTAL_HITS, totalHits);

					int resultArrayLength = resultArray.length();
					for (int i = 0; i < resultArrayLength; i++) {
						JSONObject result = resultArray.getJSONObject(i).getJSONObject(Constant._SOURCE);
						result.put(Constant.ID, resultArray.getJSONObject(i).getString(Constant._ID));
						result.put(Constant.TABLE_NAME, resultArray.getJSONObject(i).getString(Constant._INDEX));

						if (resultArray.getJSONObject(i).has(Constant.INNER_HITS)) {
							getInnerObjectData(result, resultArray.getJSONObject(i).getJSONObject(Constant.INNER_HITS));
						}
						outputArray.put(i, result);
					}
				} else {
					return null;
				}

			}
			responseObject.put(Constant.DATA, outputArray);

			return responseObject;
		} catch (Exception e) {
			e.printStackTrace();
			
			return new JSONObject();
		}

	}
	
	private void getAggregationResult(JSONObject jsonObject, JSONArray jsonArray, String countFieldName,
			JSONObject meta) {

		if (jsonObject.has(Constant.META)) {
			meta = jsonObject.getJSONObject(Constant.META);
			if (jsonObject.getJSONObject(Constant.META).has(Constant.KEY)) {
				if (jsonObject.getJSONObject(Constant.META).getJSONObject(Constant.KEY).has(Constant.COUNT)) {
					countFieldName = jsonObject.getJSONObject(Constant.META).getJSONObject(Constant.KEY)
							.getString(Constant.COUNT);
				}
			}
		}

		Set<String> keySet = jsonObject.keySet();
		for (String key : keySet) {
			if (key.startsWith(Constant.GROUP_BY)) {
				getAggregationResult(jsonObject.getJSONObject(key), jsonArray, countFieldName, meta);
			}
			if (key.equals(Constant.BUCKETS)) {
				bucketHandler(jsonObject.getJSONArray(Constant.BUCKETS), jsonArray, countFieldName, meta);
			}
		}

	}
	
	private void bucketHandler(JSONArray bucketArray, JSONArray responseArray, String countFieldName, JSONObject meta) {

		int bucketArrayLength = bucketArray.length();
		for (int i = 0; i < bucketArrayLength; i++) {

			JSONObject jsonObject = bucketArray.getJSONObject(i);

			Set<String> keySet = jsonObject.keySet();
			for (String key : keySet) {
				if (key.startsWith(Constant.GROUP_BY)) {
					getAggregationResult(jsonObject.getJSONObject(key), responseArray, countFieldName, meta);
				} else {
					if (key.equals(Constant.HITS)) {
						hitHandler(jsonObject.getJSONObject(Constant.HITS), jsonObject.getLong(Constant.DOC_COUNT),
								responseArray, countFieldName, meta, jsonObject);
					}
				}
			}

		}

	}

	private void hitHandler(JSONObject hitObject, Long count, JSONArray responseArray, String countFieldName,
			JSONObject meta, JSONObject bucketResults) {

		if (hitObject.getJSONObject(Constant.HITS).getLong(Constant.TOTAL) > 0) {
			JSONArray hitArray = hitObject.getJSONObject(Constant.HITS).getJSONArray(Constant.HITS);

			for (int i = 0; i < hitArray.length(); i++) {
				JSONObject responseObject = hitArray.getJSONObject(i).getJSONObject(Constant._SOURCE)
						.put(Constant.ID, hitArray.getJSONObject(i).getString(Constant._ID)).put(countFieldName, count);
				for (String key : meta.keySet()) {
					if (!key.equals(Constant.KEY)) {
						responseObject.put(key, meta.get(key));
					} else {
						addBucketResults(responseObject, meta, bucketResults);
					}
				}
				responseArray.put(responseArray.length(), responseObject);
			}
		}
	}

	private void addBucketResults(JSONObject responseObject, JSONObject meta, JSONObject bucketResults) {

		JSONObject aggregationTerms = meta.getJSONObject(Constant.KEY);

		Set<String> keySet = aggregationTerms.keySet();

		for (String key : keySet) {
			switch (key) {

			case Constant.SUM:

				JSONArray sumJsonKeys = aggregationTerms.getJSONArray(Constant.SUM);
				getResultFromAggregation(sumJsonKeys, bucketResults, responseObject);
				break;

			case Constant.AVG:

				JSONArray avgJsonKeys = aggregationTerms.getJSONArray(Constant.AVG);
				getResultFromAggregation(avgJsonKeys, bucketResults, responseObject);
				break;

			default:
				break;
			}

		}

	}

	private void getResultFromAggregation(JSONArray jsonKeys, JSONObject bucketResults, JSONObject responseObject) {

		int JsonKeyLength = jsonKeys.length();
		for (int i = 0; i < JsonKeyLength; i++) {

			String jsonKey = jsonKeys.getString(i);

			if (bucketResults.has(jsonKey)) {
				String[] keySplitByDot = StringUtil.splitByDot(jsonKey);
				JSONObject jsonObject;
				if (keySplitByDot.length > 1) {
					try {
						jsonObject = responseObject.getJSONObject(keySplitByDot[0]);
					} catch (Exception e) {
						jsonObject = new JSONObject();
					}
					jsonObject.put(keySplitByDot[1], bucketResults.getJSONObject(jsonKey).get(Constant.VALUE));
					responseObject.put(keySplitByDot[0], jsonObject);
				} else {
					responseObject.put(jsonKey, bucketResults.getJSONObject(jsonKey).get(Constant.VALUE));
				}
			}
		}
	}
	private void getInnerObjectData(JSONObject jsonObject, JSONObject inner_hits) {

		Set<String> innserKeySet = inner_hits.keySet();

		for (String key : innserKeySet) {

			JSONArray innerArray = new JSONArray();

			int innerHits = inner_hits.getJSONObject(key).getJSONObject(Constant.HITS).getInt(Constant.TOTAL);

			for (int i = 0; i < innerHits; i++) {

				try {
					int offset = inner_hits.getJSONObject(key).getJSONObject(Constant.HITS).getJSONArray(Constant.HITS)
							.getJSONObject(i).getJSONObject(Constant._NESTED).getInt(Constant.OFFSET);
					innerArray.put(jsonObject.getJSONArray(key).getJSONObject(offset));
				} catch (Exception e) {

				}

			}

			jsonObject.put(key, innerArray);
		}

	}
	private String convertJsonArrayToString(JSONArray array,String tableName) {

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < array.length(); i++) {
			String index = "{ \"index\" : { \"_index\" : \"" + tableName + "\", \"_type\" : \"data\", \"_id\" : \"" + i
					+ "\" } }";
			builder.append(index);
			builder.append("\n");
			builder.append(array.getJSONObject(i).toString());
			builder.append("\n");
		}
		return builder.toString();
	}

}
