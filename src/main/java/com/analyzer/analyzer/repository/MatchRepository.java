package com.analyzer.analyzer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.analyzer.analyzer.model.MatchReference;
import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

@Repository
public interface MatchRepository extends CrudRepository<MatchReference, Long>{

}
