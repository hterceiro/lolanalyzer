package com.analyzer.analyzer.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "match_list")
@EntityListeners(AuditingEntityListener.class)
public class MatchList {

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
