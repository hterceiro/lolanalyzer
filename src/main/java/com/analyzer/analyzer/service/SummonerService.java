package com.analyzer.analyzer.service;

import com.analyzer.analyzer.model.Summoner;
import com.analyzer.analyzer.repository.SummonerRepository;
import com.analyzer.analyzer.url.Http;
import com.analyzer.analyzer.url.UrlBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Component
@Service
public class SummonerService {

    @Autowired
    SummonerRepository summonerRepository;
    
    
    @Autowired
    UrlBuilder urlBuilder;

    @Bean
    @Qualifier(value = "entityManager")
    public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {

        return entityManagerFactory.createEntityManager();
    }

    public void save(Summoner summoner) {
        summonerRepository.save(summoner);
    }

    public List<Summoner> getAllSummoners() {
        return (List<Summoner>) summonerRepository.findAll();
    }

    public void delete(Summoner summoner) {
        summonerRepository.delete(summoner);
    }

    public Optional<Summoner> getSummonerById(Long id) {
        return summonerRepository.findById(id);
    }

    public void update(Summoner summoner) {
        summonerRepository.save(summoner);
    }
    

    public Summoner getSummonerByName(String name) throws IOException {
    	ObjectMapper objectMapper = new ObjectMapper();
    	Http http = new  Http();
    	String retorno = http.chamaUrl(urlBuilder.getSummonerByName(name));
    	Summoner summoner = new Summoner();
		summoner = objectMapper.readValue(retorno, Summoner.class);
		
        return summoner;
    }
    
    
}
