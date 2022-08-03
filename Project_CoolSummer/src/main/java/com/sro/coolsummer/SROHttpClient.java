package com.sro.coolsummer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

public class SROHttpClient {
	public static InputStream download(String addr) throws IOException{
		URL u = new URL(addr);
		if (addr.startsWith("https")) {
			HttpURLConnection huc = (HttpsURLConnection)u.openConnection();
			return huc.getInputStream();
		}else {
			HttpURLConnection huc = (HttpURLConnection)u.openConnection();
			return huc.getInputStream();
		}
	}
	
	public static InputStream download(String addr, HashMap<String, String> headers) throws IOException{
		URL u = new URL(addr);
		if (addr.startsWith("https")) {
			HttpsURLConnection huc = (HttpsURLConnection)u.openConnection();
			Set<String> headerNames = headers.keySet();
			for (String hn : headerNames) {
				huc.addRequestProperty(hn, headers.get(hn));
			}
			return huc.getInputStream();
		} else {
			HttpURLConnection huc = (HttpURLConnection)u.openConnection();
			Set<String> headerNames = headers.keySet();
			for (String hn : headerNames) {
				huc.addRequestProperty(hn, headers.get(hn));
			}
			return huc.getInputStream();
		}
	}
	
	public static String convert(InputStream is, String charSet) throws IOException {
		InputStreamReader isr = new InputStreamReader(is, charSet);
		BufferedReader br = new BufferedReader(isr);
		
		String line = null;
		StringBuffer sb = new StringBuffer();
		
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		return sb.toString();
	}
}
