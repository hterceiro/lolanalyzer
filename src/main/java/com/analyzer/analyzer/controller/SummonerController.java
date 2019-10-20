package com.analyzer.analyzer.controller;

import com.analyzer.analyzer.model.Summoner;
import com.analyzer.analyzer.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SummonerController {

    @Autowired
    SummonerService summonerService;

    @GetMapping("/hello")
    public String hello() {
        return "Relou orde";
    }

    @PostMapping("/cadastrar-summoner")
    public String cadastrarVaga(@Valid @RequestBody Summoner summoner) {
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
