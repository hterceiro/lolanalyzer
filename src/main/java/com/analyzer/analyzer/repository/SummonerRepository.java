package com.analyzer.analyzer.repository;

import com.analyzer.analyzer.model.Summoner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SummonerRepository extends CrudRepository<Summoner, Long> {
}
