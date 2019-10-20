package com.analyzer.analyzer.model;

import java.io.Serializable;
import java.util.List;

public class Match implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7851220038365151253L;
	
	
	
	
	 	private int seasonId;   //Please refer to the Game Constants documentation.
		private int queueId ;	//Please refer to the Game Constants documentation.
		private long gameId ;
	 	private List<ParticipantIdentity> participantIdentities; 	//Participant identity information.
	 	private String gameVersion;	//The major.minor version typically indicates the patch the match was played on.
		private String platformId;	//Platform where the match was played.
	 	private String gameMode;	//Please refer to the Game Constants documentation.
	 	private int mapId;	//Please refer to the Game Constants documentation.
	 	private String gameType;	//Please refer to the Game Constants documentation.
	 	private List<TeamStats> teams; 	//Team information.
	 	private List<Participant> participants;	//Participant information.
	 	private long gameDuration;//Match duration in seconds.
	 	private long gameCreation;
		public int getSeasonId() {
			return seasonId;
		}
		public int getQueueId() {
			return queueId;
		}
		public long getGameId() {
			return gameId;
		}
		public List<ParticipantIdentity> getParticipantIdentities() {
			return participantIdentities;
		}
		public String getGameVersion() {
			return gameVersion;
		}
		public String getPlatformId() {
			return platformId;
		}
		public String getGameMode() {
			return gameMode;
		}
		public int getMapId() {
			return mapId;
		}
		public String getGameType() {
			return gameType;
		}
		public List<TeamStats> getTeams() {
			return teams;
		}
		public List<Participant> getParticipants() {
			return participants;
		}
		public long getGameDuration() {
			return gameDuration;
		}
		public long getGameCreation() {
			return gameCreation;
		}
	 	
	 	
	 	
	 	
	 	

}
