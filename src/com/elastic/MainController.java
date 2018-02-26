package com.elastic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.elastic.search.Constant;
import com.elastic.search.ElasticSearchConnectionException;
import com.elastic.search.ElasticUtility;

public class MainController {

	String[] jsonStrings;

	List<String> listStrings = null;

	public MainController() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(Constant.JSON_FILE_PATH)));
			String str = null;
			String stringSearch = null;

			if ((str = br.readLine()) != null) {
				stringSearch = str.substring(1, str.length() - 2);
			}

			br.close();
			jsonStrings = stringSearch.split("},");

			listStrings = Arrays.asList(jsonStrings);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated constructor stub
	}

	public void persistToES(String arg0,String arg1) throws JSONException, Exception, ElasticSearchConnectionException {
		ElasticUtility elasticUtility = new ElasticUtility();

		JSONObject jsonObject = null;
		try {


			// latest count = 17499
			int i = Integer.parseInt(arg0);
			int j = Integer.parseInt(arg1);

			System.out.println(listStrings.size());
			String json = null;
			for (int count = i; count < j; count++) {
				json = listStrings.get(count);
				json = json + "}\n";
				jsonObject = new JSONObject(json);
				elasticUtility.updateIndex(jsonObject, String.valueOf(count), Constant.ES_INDEX_NAME);

			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			elasticUtility = null;
		}
		// return jsonObject.toString();

	}

	public static void main(String[] args) throws Exception {

		try {
			MainController controller = new MainController();

			controller.persistToES(args[0],args[1]);

			System.gc();
		} catch (Exception | ElasticSearchConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
