package com.yazlab.projeone.controller;

import com.yazlab.projeone.model.WordInput;
import com.yazlab.projeone.algoritma.algoritma;
import com.yazlab.projeone.repos.WordInputRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class RequestController {
    private final WordInputRepository wordInputRepository;

    private algoritma algoritma = new algoritma();

    public RequestController(WordInputRepository wordInputRepository) {
        this.wordInputRepository = wordInputRepository;
    }

    @PostMapping("/birlestir")
    public WordInput birlestir(@RequestBody WordInput wordInput) {
        long basla = System.nanoTime();
        String birlesmis = algoritma.kelime_yolla(wordInput.getGirilenler());
        long bitis = System.nanoTime();
        wordInput.setBirlesmis(birlesmis);
        long gecensure = bitis - basla;
        double gecensurenano = (double)gecensure;
        wordInput.setGecensure(Double.toString(gecensurenano) + " nanosaniye");
        return wordInput;
    }

    @PostMapping("/kaydet")
    public WordInput metinleriKaydet(@RequestBody WordInput wordInput) {
        wordInputRepository.save(wordInput);
        return wordInput;
    }

    @GetMapping("/jsongetir")
    public List<WordInput> dokumanGetir() {
        return wordInputRepository.findAll();
    }

}
