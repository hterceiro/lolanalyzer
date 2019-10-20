package com.analyzer.analyzer.controller;

import com.analyzer.analyzer.model.Summoner;
import com.analyzer.analyzer.service.SummonerService;
import com.analyzer.analyzer.url.Http;
import com.analyzer.analyzer.url.UrlBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SummonerController {

    @Autowired
    SummonerService summonerService;
    
    @Autowired
    UrlBuilder urlBuilder;
    
    
    @RequestMapping("/teste")
    public String home(){
        return "Hello World!";
    }
    
    

    @GetMapping("/summoner-name/{name}")
    public Summoner getSummonerByName(@PathVariable(value = "name") String name) throws IOException {
    	ObjectMapper objectMapper = new ObjectMapper();
    	Http http = new  Http();
    	String retorno = http.chamaUrl(urlBuilder.getSummonerByName(name));
    	Summoner summoner = new Summoner();
		summoner = objectMapper.readValue(retorno, Summoner.class);
		
		summonerService.save(summoner);
        return summoner;
    }

    @PostMapping("/cadastrar-summoner")
    public String cadastrarSummoner(@Valid @RequestBody Summoner summoner) {
        String retorno = "";
        try {
            summonerService.save(summoner);
            retorno = "summoner cadastrado com sucesso.";
        } catch (Exception e) {
            retorno = "Não foi possivel cadastrar a summoner";
        }
        return retorno;
    }

    @GetMapping("/summoners")
    public List<Summoner> getAllSummoners() {
            return summonerService.getAllSummoners();
    }
    

    
    
}
