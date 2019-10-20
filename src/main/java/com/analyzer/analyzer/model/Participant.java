package com.analyzer.analyzer.model;

import java.util.List;

public class Participant {

	private ParticipantStats stats; // Participant statistics.
	private int participantId;
	private List<Rune> runes; // List of legacy Rune information. Not included for matches played with Runes
								// Reforged.
	private ParticipantTimeline timeline; // Participant timeline data.
	private int teamId; // 100 for blue side. 200 for red side.
	private int spell2Id; // Second Summoner Spell id.
	private List<Mastery> masteries; // List of legacy Mastery information. Not included for matches played with
										// Runes Reforged.
	private String highestAchievedSeasonTier; // Highest ranked tier achieved for the previous season in a specific
												// subset of queueIds, if any, otherwise null. Used to display border in
												// game loading screen. Please refer to the Ranked Info documentation.
												// (Legal values: CHALLENGER, MASTER, DIAMOND, PLATINUM, GOLD, SILVER,
												// BRONZE, UNRANKED)
	private int spell1Id; // First Summoner Spell id.
	private int championId;

	public ParticipantStats getStats() {
		return stats;
	}

	public int getParticipantId() {
		return participantId;
	}

	public List<Rune> getRunes() {
		return runes;
	}

	public ParticipantTimeline getTimeline() {
		return timeline;
	}

	public int getTeamId() {
		return teamId;
	}

	public int getSpell2Id() {
		return spell2Id;
	}

	public List<Mastery> getMasteries() {
		return masteries;
	}

	public String getHighestAchievedSeasonTier() {
		return highestAchievedSeasonTier;
	}

	public int getSpell1Id() {
		return spell1Id;
	}

	public int getChampionId() {
		return championId;
	}

}
