package com.analyzer.analyzer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.analyzer.analyzer.model.Summoner;

@Repository
public interface SummonerRepository extends CrudRepository<Summoner, Long> {
}
