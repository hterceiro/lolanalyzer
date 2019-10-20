package com.analyzer.analyzer.model;

public class TeamBans {

	private int pickTurn; // Turn during which the champion was banned.
	private int championId;// Banned championId.

	public int getPickTurn() {
		return pickTurn;
	}

	public int getChampionId() {
		return championId;
	}

}
