package com.analyzer.analyzer.model;

import java.util.List;

public class TeamStats {

	private boolean firstDragon; // Flag indicating whether or not the team scored the first Dragon kill.
	private boolean firstInhibitor; // Flag indicating whether or not the team destroyed the first inhibitor.
	private List<TeamBans> bans; // If match queueId has a draft, contains banned champion data, otherwise empty.
	private int baronKills; // Number of times the team killed Baron.
	private boolean firstRiftHerald; // Flag indicating whether or not the team scored the first Rift Herald kill.
	private boolean firstBaron; // Flag indicating whether or not the team scored the first Baron kill.
	private int riftHeraldKills; // Number of times the team killed Rift Herald.
	private boolean firstBlood; // Flag indicating whether or not the team scored the first blood.
	private int teamId; // 100 for blue side. 200 for red side.
	private boolean firstTower; // Flag indicating whether or not the team destroyed the first tower.
	private int vilemawKills; /// Number of times the team killed Vilemaw.
	private int inhibitorKills; // Number of inhibitors the team destroyed.
	private int towerKills; // Number of towers the team destroyed.
	private int dominionVictoryScore; // For Dominion matches, specifies the points the team had at game end.
	private String win; // String indicating whether or not the team won. There are only two values
	// visibile in public match history. (Legal values: Fail, Win)

	public boolean isFirstDragon() {
		return firstDragon;
	}

	public boolean isFirstInhibitor() {
		return firstInhibitor;
	}

	public List<TeamBans> getBans() {
		return bans;
	}

	public int getBaronKills() {
		return baronKills;
	}

	public boolean isFirstRiftHerald() {
		return firstRiftHerald;
	}

	public boolean isFirstBaron() {
		return firstBaron;
	}

	public int getRiftHeraldKills() {
		return riftHeraldKills;
	}

	public boolean isFirstBlood() {
		return firstBlood;
	}

	public int getTeamId() {
		return teamId;
	}

	public boolean isFirstTower() {
		return firstTower;
	}

	public int getVilemawKills() {
		return vilemawKills;
	}

	public int getInhibitorKills() {
		return inhibitorKills;
	}

	public int getTowerKills() {
		return towerKills;
	}

	public int getDominionVictoryScore() {
		return dominionVictoryScore;
	}

	public String getWin() {
		return win;
	}

	public int getDragonKills() {
		return dragonKills;
	}

	private int dragonKills; // Number of times the team killed Dragon.

}
