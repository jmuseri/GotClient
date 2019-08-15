package com.sa.bbva.got.client.service;

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
import com.sa.bbva.got.client.exception.RestClientException;

/**
 * Cliente Rest por Http
 * @author jmuseri
 *
 */

public class RestClientService {
	
	private String restURI;	
	
	public RestClientService(String restURI) {
		super();
		this.restURI = restURI;
	}
	
	
	
	
	/**
	 * Ejecutar peticion sin parametros get.
	 * @param oper Operacion a ejecutar.
	 * @param obj Parametros post a jsonizar. 
	 * @return Object respuesta del tipo oper.getResponseClass()
	 * @throws GotClientException
	 */
	public Object ejecutarServicio (RestOperation oper, Object ob ) throws RestClientException{
		return ejecutarServicio(oper, null, ob);
	}
	
	/**
	 * Ejecutar peticion sin parametros post.
	 * @param oper Operacion a ejecutar.
	 * @param obj Parametros post a jsonizar. 
	 * @return Object respuesta del tipo oper.getResponseClass()
	 * @throws GotClientException
	 */
	public Object ejecutarServicio (RestOperation oper, Map<String, String> params ) throws RestClientException{
		return ejecutarServicio(oper, params, null);
	}

	
	
	public Object ejecutarServicio (RestOperation oper,  Map<String, String> params, Object obj ) throws RestClientException{
		String inputString = null;
		int responseCode = 0;
		Object bean = null;
		try {
			URL url = new URL(restURI+getParamReplacement(oper.getUrl(),params));
			System.out.println("OP: "+url);
			// Get an HttpURLConnection subclass object instead of URLConnection
			HttpURLConnection myHttpConnection = (HttpURLConnection) url.openConnection();
			// setRequestMethod
			myHttpConnection.setRequestMethod(oper.getRequestMethod());
			myHttpConnection.setRequestProperty("Content-Type", "application/json");

	        // Output the JSON string to the REST service
           if (obj!=null) {
    	        myHttpConnection.setDoOutput(true);
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
			throw new RestClientException("Error while trying to invoke "+oper.getUrl()+ " "+ e.getMessage());
		}
		return bean;
	}	
	
	
	/**
	 * Arma la url del request con los parametros (get)
	 * 
	 */
	private String getParamReplacement(String opUrl, Map<String, String> params) {
		if (params !=null){
			Set<String> mapKeys = params.keySet();
			StringBuffer paramAdicionales =new StringBuffer();
	        for (String key : mapKeys) {
	        	if (opUrl.contains("\\{" + key + "\\}")) {
	        		opUrl = opUrl.replaceAll("\\{" + key + "\\}", params.get(key));	
	        	} else {
	        		paramAdicionales.append(key)
		        		.append("=")
		        		.append(params.get(key))
		        		.append("&");
	        	}
	        }
	        if (paramAdicionales.length()>0) {
	        		opUrl.concat("?")
	        		.concat(paramAdicionales.substring(0, paramAdicionales.lastIndexOf("&")));
	        }
		}        
		return opUrl;
	}	
	
	/**
	 * 
	 * @param <T> Devuelve una clase del tipo MiClase.
	 * @param json El String del Json
	 * @param miClase Clase a la que voy a mapear el Json
	 * @return Mapea del json a un objeto de la clase miClase.
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private <T> T mapFromJson(String json, Class<T> miClase) throws JsonParseException, JsonMappingException, IOException {
	    ObjectMapper objectMapper = new ObjectMapper();
	    return objectMapper.readValue(json, miClase);
	}
	
	
	
	
	
	

}	