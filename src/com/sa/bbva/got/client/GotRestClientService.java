package com.sa.bbva.got.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sa.bbva.got.client.exception.GotClientException;
//
public class GotRestClientService {
	private static final String REST_URI = "http://localhost:8180";

	
	public Object ejecutarServicio (GotOperationsEnum oper, Object ob ) throws GotClientException{
		return this.ejecutarServicio(oper, null, ob);
	}
	
	public Object ejecutarServicio (GotOperationsEnum oper, Map<String, String> params ) throws GotClientException{
		return this.ejecutarServicio(oper, params, null);
	}
	
	
	public Object ejecutarServicio (GotOperationsEnum oper,  Map<String, String> params, Object obj ) throws GotClientException{
		String inputString = null;
		int responseCode = 0;
		Object bean = null;
		try {
			URL url = new URL(REST_URI+getParamReplacement(oper.getUrl(),params, oper.getRequestMethod()));
			System.out.println("OP: "+url);
			// Get an HttpURLConnection subclass object instead of URLConnection
			HttpURLConnection myHttpConnection = (HttpURLConnection) url.openConnection();
			// setRequestMethod
			myHttpConnection.setRequestMethod(oper.getRequestMethod());


	        // Output the JSON string to the REST service
           if (obj!=null) {
    	        myHttpConnection.setDoOutput(true);
                myHttpConnection.setRequestProperty("Content-Type", "application/json");
		        OutputStream output = myHttpConnection.getOutputStream();
			    ObjectMapper objectMapper = new ObjectMapper();
			    objectMapper.writeValue(output, obj);
		        output.flush();
            }			
			// get the response-code from the response
			responseCode = myHttpConnection.getResponseCode();
			System.out.println("RESPONSE CODE: "+responseCode);
			if (responseCode != HttpURLConnection.HTTP_OK) throw new Exception ("Error consuming rest service "+url+"\n "+myHttpConnection.getResponseMessage());
			// open the contents of the URL as an inputStream and print to stdout
			BufferedReader in = new BufferedReader(new InputStreamReader(myHttpConnection.getInputStream()));
			while ((inputString = in.readLine()) != null) {
				bean = mapFromJson(inputString, Class.forName(oper.getResponseClass()));
			}
			in.close();

				
		}catch (Exception e) {
			throw new GotClientException("Error while trying to invoke "+oper.getUrl()+ " "+ e.getMessage());
		}
		return bean;
	}
	
	
	
	private String getParamReplacement(String opUrl, Map<String, String> params, String requestMethod) {
		if (params !=null){
			Set<String> mapKeys = params.keySet();
			// Recorremos el mapa por sus llaves e imprimimos sus valores.
	        for (String key : mapKeys) {
	        	opUrl = opUrl.replaceAll("\\{" + "id" + "\\}", params.get(key));
	        }
		}        
		return opUrl;
		
	}	
	
	
	private static <T> T mapFromJson(String json, Class<T> miClase) throws JsonParseException, JsonMappingException, IOException {
	    ObjectMapper objectMapper = new ObjectMapper();
	    return objectMapper.readValue(json, miClase);
	}
	
	

}	