package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Exercicio;
import me.dio.academia.digital.entity.form.ExercicioForm;
import me.dio.academia.digital.service.impl.ExercicioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicio")
public class ExercicioController {
    @Autowired
    ExercicioServiceImpl service;

    @PostMapping
    public Exercicio create(@RequestBody ExercicioForm form){
        return null;
    } //return service.create(form);

    @GetMapping
    public List<Exercicio> getAll(){
        return service.getAll();
    }
}
