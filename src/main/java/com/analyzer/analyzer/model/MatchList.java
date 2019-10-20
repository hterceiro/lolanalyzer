package com.analyzer.analyzer.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

public class MatchList implements Serializable {

	private List<MatchReference> matches;
	private int totalGames;
	private int startIndex;
	private int endIndex;
	
	public List<MatchReference> getMatches() {
		return matches;
	}
	public int getTotalGames() {
		return totalGames;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public int getEndIndex() {
		return endIndex;
	}
	
}
