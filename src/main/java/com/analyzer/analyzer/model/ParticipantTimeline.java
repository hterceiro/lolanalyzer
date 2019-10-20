package com.analyzer.analyzer.model;

import java.util.Map;

public class ParticipantTimeline {

	private String lane;
	private int participantId;
	private Map<String, Double> csDiffPerMinDeltas;
	private Map<String, Double> goldPerMinDeltas;
	private Map<String, Double> xpDiffPerMinDeltas;
	private Map<String, Double> creepsPerMinDeltas;
	private Map<String, Double> xpPerMinDeltas;
	private String role;
	private Map<String, Double> damageTakenDiffPerMinDeltas;
	private Map<String, Double> damageTakenPerMinDeltas;

	public String getLane() {
		return lane;
	}

	public int getParticipantId() {
		return participantId;
	}

	public Map<String, Double> getCsDiffPerMinDeltas() {
		return csDiffPerMinDeltas;
	}

	public Map<String, Double> getGoldPerMinDeltas() {
		return goldPerMinDeltas;
	}

	public Map<String, Double> getXpDiffPerMinDeltas() {
		return xpDiffPerMinDeltas;
	}

	public Map<String, Double> getCreepsPerMinDeltas() {
		return creepsPerMinDeltas;
	}

	public Map<String, Double> getXpPerMinDeltas() {
		return xpPerMinDeltas;
	}

	public String getRole() {
		return role;
	}

	public Map<String, Double> getDamageTakenDiffPerMinDeltas() {
		return damageTakenDiffPerMinDeltas;
	}

	public Map<String, Double> getDamageTakenPerMinDeltas() {
		return damageTakenPerMinDeltas;
	}

}
