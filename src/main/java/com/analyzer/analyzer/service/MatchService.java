package com.analyzer.analyzer.service;

import com.analyzer.analyzer.model.MatchReference;
import com.analyzer.analyzer.model.Summoner;
import com.analyzer.analyzer.repository.MatchRepository;
import com.analyzer.analyzer.repository.SummonerRepository;
import com.analyzer.analyzer.url.Http;
import com.analyzer.analyzer.url.UrlBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Component
@Service
public class MatchService {

    @Autowired
    MatchRepository matchRepository;
    
    @Autowired
    UrlBuilder urlBuilder;

    public void save(MatchReference match) {
    	matchRepository.save(match);
    }

    public List<MatchReference> getAllSummoners() {
        return (List<MatchReference>) matchRepository.findAll();
    }

    public void delete(MatchReference match) {
    	matchRepository.delete(match);
    }

    public Optional<MatchReference> getSummonerById(Long id) {
        return matchRepository.findById(id);
    }

    public void update(MatchReference match) {
    	matchRepository.save(match);
    }
    

    public Summoner getSummonerByName(@PathVariable(value = "name") String name) throws IOException {
    	ObjectMapper objectMapper = new ObjectMapper();
    	Http http = new  Http();
    	String retorno = http.chamaUrl(urlBuilder.getSummonerByName(name));
    	Summoner summoner = new Summoner();
		summoner = objectMapper.readValue(retorno, Summoner.class);
		
        return summoner;
    }
    
    
}
