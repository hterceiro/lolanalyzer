package com.analyzer.analyzer.model;

public class Player {
	
	
	 	private String 	currentPlatformId;
	 	private String 	summonerName;
	 	private String matchHistoryUri; 	
	 	private String 	platformId;   //Original platformId.
	 	private String currentAccountId;  //Player's current accountId (Encrypted)
	 	private int profileIcon;
	 	private String summonerId; 	//Player's summonerId (Encrypted)
	 	private String accountId; 	//Player's original accountId (Encrypted) 
	 	
	 	
	 	
	 	
	 	
	 	
		public String getCurrentPlatformId() {
			return currentPlatformId;
		}
		public String getSummonerName() {
			return summonerName;
		}
		public String getMatchHistoryUri() {
			return matchHistoryUri;
		}
		public String getPlatformId() {
			return platformId;
		}
		public String getCurrentAccountId() {
			return currentAccountId;
		}
		public int getProfileIcon() {
			return profileIcon;
		}
		public String getSummonerId() {
			return summonerId;
		}
		public String getAccountId() {
			return accountId;
		}

}
