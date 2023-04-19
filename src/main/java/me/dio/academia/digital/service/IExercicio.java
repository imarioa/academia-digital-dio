package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Exercicio;
import me.dio.academia.digital.entity.Treino;
import me.dio.academia.digital.entity.form.ExercicioForm;
import me.dio.academia.digital.entity.form.TreinoForm;

import java.util.List;

public interface IExercicio {
    Exercicio create(ExercicioForm form);
    List<Exercicio> getAll();
}
