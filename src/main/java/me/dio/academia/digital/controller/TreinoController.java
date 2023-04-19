package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Treino;
import me.dio.academia.digital.entity.form.TreinoForm;
import me.dio.academia.digital.service.impl.TreinoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/treino")
public class TreinoController {
    @Autowired
    TreinoServiceImpl service;

    @PostMapping
    public Treino create(@RequestBody TreinoForm form){
        return service.create(form);
    }

    @GetMapping
    public List<Treino> getAll(){
        return service.getAll();
    }

}
