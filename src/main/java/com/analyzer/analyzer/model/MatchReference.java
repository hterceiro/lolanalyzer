package com.analyzer.analyzer.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "match_reference")
@EntityListeners(AuditingEntityListener.class)
public class MatchReference implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 8076597432774197339L;
	
	
	private String lane;
	@Id
	private long gameId;
	private  int champion;
	private String plataformId;
	private int season;
	private int queue;
	private String role;
	private long timestamp;
	
	public long getGameId() {
		return gameId;
	}

	public int getChampion() {
		return champion;
	}

	public String getPlataformId() {
		return plataformId;
	}

	public int getSeason() {
		return season;
	}

	public int getQueue() {
		return queue;
	}

	public String getRole() {
		return role;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getLane() {
		return lane;
	}

}
