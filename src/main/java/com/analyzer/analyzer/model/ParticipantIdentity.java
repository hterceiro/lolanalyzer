package com.analyzer.analyzer.model;

import java.io.Serializable;

public class ParticipantIdentity implements Serializable{
	
	
	 	/**
	 * 
	 */
	private static final long serialVersionUID = 8997554277239962540L;
	
		private Player player;	//Player information.
		private int participantId;
		
		
		public Player getPlayer() {
			return player;
		}


		public int getParticipantId() {
			return participantId;
		}

}
