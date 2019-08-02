package com.museri;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
//
public class GotRestClientService {
	private static final String REST_URI = "http://localhost:8180";
	
	public Object ejecutarServicio (GotOperationsEnum oper,String responseClass, Map<String, String> params){
		String inputString = null;
		int responseCode = 0;
		Object bean = null;
		try {
			URL url = new URL(REST_URI+getParamReplacement(oper.getUrl(),params));
	
				// Get an HttpURLConnection subclass object instead of URLConnection
				HttpURLConnection myHttpConnection = (HttpURLConnection) url.openConnection();

				// setRequestMethod
				myHttpConnection.setRequestMethod(oper.getRequestMethod());

				// get the response-code from the response
				responseCode = myHttpConnection.getResponseCode();
				if (responseCode != HttpURLConnection.HTTP_OK) throw new Exception ("Error consuming rest service "+url+"\n "+myHttpConnection.getResponseMessage());
				
				
				// open the contents of the URL as an inputStream and print to stdout
				BufferedReader in = new BufferedReader(new InputStreamReader(myHttpConnection.getInputStream()));
				while ((inputString = in.readLine()) != null) {
					System.out.println(inputString);
					bean = new ObjectMapper().readValue(inputString, Class.forName(responseClass));
				}
				in.close();

				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		return bean;
	}
	
	private String getParamReplacement(String opUrl, Map<String, String> params) {
		
        Set<String> mapKeys = params.keySet();
        // Recorremos el mapa por sus llaves e imprimimos sus valores.
        for (String key : mapKeys) {
        	opUrl = opUrl.replaceAll("\\{" + "id" + "\\}", params.get(key));
        }
		return opUrl;
	}
	
	public static void main(String[] args) {
		GotRestClientService gotClient = new GotRestClientService();
		HashMap<String,String> params = new HashMap<String, String>();
		params.put("id","1");
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.AUTORIZADO_SHOW, "com.sa.bbva.got.model.Autorizado", params);
		System.out.println(obj.toString());
	}
}	