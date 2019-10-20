package com.analyzer.analyzer.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "summoner")
@EntityListeners(AuditingEntityListener.class)
public class Summoner implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -471528858714865702L;

    private Long idSummoner;
    private String id;
    private int profileIconId;
    private String name;
    private String puuid;
    private long summonerLevel;
    private long revisionDate;
    @Id
    private String accountId;

    public Long getIdSummoner() {
        return idSummoner;
    }

    public String getId() {
        return id;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public String getName() {
        return name;
    }

    public String getPuuid() {
        return puuid;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public String getAccountId() {
        return accountId;
    }
}
