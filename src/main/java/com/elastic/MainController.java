package com.elastic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.elastic.search.Constant;
import com.elastic.search.ElasticSearchConnectionException;
import com.elastic.search.ElasticUtility;

public class MainController {

	String[] jsonStrings;

	List<String> listStrings = null;

	String fileName = null;

	ElasticUtility elasticUtility = null;

	public MainController() {
		try {
			this.elasticUtility = new ElasticUtility();
			File jsonFiles = new File(Constant.JSON_FILE_PATH);

			for (File jsonFile : jsonFiles.listFiles()) {
				BufferedReader br = new BufferedReader(new FileReader(jsonFile));
				fileName = jsonFile.getName().substring(0, jsonFile.getName().indexOf("."));
				String str = null;
				String stringSearch = null;

				if ((str = br.readLine()) != null) {
					stringSearch = str.substring(1, str.length() - 2);
				}

				br.close();
				jsonStrings = stringSearch.split("},");

				listStrings = Arrays.asList(jsonStrings);

				/*try {
					persistToESBulk();
				} catch (ElasticSearchConnectionException e) { 
					e.printStackTrace();
				}*/

				// if(args.length==1)
				//deleteDocument();

			}
			
			performSearchOperation("12");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated constructor stub
	}

	public void persistToESIndex(String arg0, String arg1)
			throws JSONException, Exception, ElasticSearchConnectionException {

		JSONObject jsonObject = null;
		try {

			// latest count = 17499
			int i = Integer.parseInt(arg0);
			int j = Integer.parseInt(arg1);

			System.out.println("No. of records in file: "+listStrings.size());
			String json = null;
			for (int count = i; count < j; count++) {
				json = listStrings.get(count);
				json = json + "}\n";
				jsonObject = new JSONObject(json);
				elasticUtility.updateIndex(jsonObject, String.valueOf(count), fileName);

			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			elasticUtility = null;
		}
		// return jsonObject.toString();

	}

	public void persistToESBulk() throws JSONException, Exception, ElasticSearchConnectionException {

		JSONObject jsonObject = null;
		try {

			JSONArray jsonArray = new JSONArray();
			System.out.println("No. of records in file: "+listStrings.size());
			String json = null;
			for (int count = 0; count < listStrings.size(); count++) {
				json = listStrings.get(count);
				json = json + "}";
				jsonObject = new JSONObject(json);

				jsonArray.put(count, jsonObject);
			}

			System.out.println("No. of records after parsing: "+jsonArray.length());
			
			
			elasticUtility.updateBulkIndex(jsonArray, fileName);
		} finally {
			elasticUtility = null;
		}
		// return jsonObject.toString();

	}

	private void deleteDocument() {
		try {
			elasticUtility.deleteDocument(fileName);
		} catch (Exception | ElasticSearchConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void performSearchOperation(String searchString){
		String searchQuery = "{\n" + 
	              "  \"query\": {\n" + 
	              "    \"bool\": {\n" + 
	              "      \"should\": [\n" + 
	              "        { \"match\": { \"_id\": \""+searchString+"\" } },\n" + 
	              "      ]\n" + 
	              "    }\n" + 
	              "  },\n" + 
	              "}";             
	         
	    JSONObject userQuery = new JSONObject(searchQuery);
	    String indexName = fileName;
	    try {
			elasticUtility.getDataFromElastic(indexName, userQuery);
		} catch (Exception | ElasticSearchConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception {

		try {
			MainController controller = new MainController();

			System.exit(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
