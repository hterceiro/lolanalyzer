package com.analyzer.analyzer.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
 
public class Http {
	
	
	private URL url;
 
    public String chamaUrl(String url) throws IOException {
       this.url = new URL(url);
      BufferedReader bufferedReader = new BufferedReader(
        new InputStreamReader(this.url.openStream()));
 
      String retornoJson;
 
      StringBuilder builder = new StringBuilder();
      while ((retornoJson = bufferedReader.readLine()) != null)
        builder.append(retornoJson);
 
      bufferedReader.close();
 
      return builder.toString();
    }
}