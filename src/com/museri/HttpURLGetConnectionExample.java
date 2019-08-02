package com.museri;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sa.bbva.got.model.Autorizado;



public class HttpURLGetConnectionExample {
	 private static final String REST_URI = "http://localhost:8180/";
	public static void main(String[] args) {
		String requestURL = REST_URI+ "funcional/autorizado/show/1";
		String inputString = null;

		int responseCode = 0;
		try {

			URL url = new URL(requestURL);

			try {

				// Get an HttpURLConnection subclass object instead of URLConnection

				HttpURLConnection myHttpConnection = (HttpURLConnection) url.openConnection();

				// ensure you use the GET method

				myHttpConnection.setRequestMethod("GET");

				// get the response-code from the response

				responseCode = myHttpConnection.getResponseCode();

				// print out URL details

				System.out.format("Connecting to %s\nConnection Method: '%s'\nResponse Code is: %d\n", requestURL,
						"GET", responseCode);

				System.out.println("----[ URL DETAILS ]-----------------");

				System.out.println("URL Protocol....: " + url.getProtocol());

				System.out.println("URL Host........: " + url.getHost());

				System.out.println("URL Port........: " + url.getPort());

				System.out.println("URL Authority...: " + url.getAuthority());

				System.out.println("URL Path........: " + url.getPath());

				System.out.println("URL User Info...: " + url.getUserInfo());
				System.out.println("URL Query Info..: " + url.getQuery());
				System.out.println(
						"----[ OUTPUT BELOW ]-----------------------------------------------------------------");
				// open the contents of the URL as an inputStream and print to stdout
				BufferedReader in = new BufferedReader(new InputStreamReader(myHttpConnection.getInputStream()));
				while ((inputString = in.readLine()) != null) {
					System.out.println(inputString);
					Autorizado bean = new ObjectMapper().readValue(inputString, Autorizado.class);
					System.out.println(bean.toString());
				}
				in.close();
				System.out.println(
						"-------------------------------------------------------------------------------------");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
