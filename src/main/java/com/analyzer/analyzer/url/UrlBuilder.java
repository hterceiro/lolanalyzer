package com.analyzer.analyzer.url;

import java.net.MalformedURLException;

import org.springframework.stereotype.Component;

@Component
public class UrlBuilder {
	
	private String url;
	private static final String KEY = "RGAPI-022bd21f-f53c-4894-bed6-306b921f7858";

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) throws MalformedURLException {
		this.url = new String(url);
	}

	public String getSummonerByName(String name) {
		return "https://br1.api.riotgames.com/lol/summoner/v4/summoners/by-name/"+name+"?api_key="+KEY;
	}
}
