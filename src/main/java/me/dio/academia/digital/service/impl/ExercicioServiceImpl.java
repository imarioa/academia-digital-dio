package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.Exercicio;
import me.dio.academia.digital.entity.Treino;
import me.dio.academia.digital.entity.form.ExercicioForm;
import me.dio.academia.digital.entity.form.TreinoForm;
import me.dio.academia.digital.repository.ExercicioRepository;
import me.dio.academia.digital.repository.TreinoRepository;
import me.dio.academia.digital.service.IExercicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExercicioServiceImpl implements IExercicio {
    @Autowired
    ExercicioRepository repository;

    @Override
    public Exercicio create(ExercicioForm form) {
        Exercicio novoExercicio = new Exercicio();

        novoExercicio.setNome(form.getNome());
        novoExercicio.setRepeticoes(form.getRepeticoes());
        novoExercicio.setSeries(form.getSeries());
        return repository.save(novoExercicio);
    }

    @Override
    public List<Exercicio> getAll() {
        return repository.findAll();
    }

}
