package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.Exercicio;
import me.dio.academia.digital.entity.Treino;
import me.dio.academia.digital.entity.form.TreinoForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.AvaliacaoFisicaRepository;
import me.dio.academia.digital.repository.ExercicioRepository;
import me.dio.academia.digital.repository.TreinoRepository;
import me.dio.academia.digital.service.ITreinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TreinoServiceImpl implements ITreinoService {
    @Autowired
    TreinoRepository repository;

    @Autowired
    ExercicioRepository exercicioRepository;

    @Autowired
    AlunoRepository alunoRepository;
    @Override
    public Treino create(TreinoForm treino) {
        Aluno aluno = alunoRepository.getById(treino.getAlunoId());
        Exercicio exercicio = exercicioRepository.getById(treino.getExercicioId());
        Treino novoTreino = new Treino();
        novoTreino.setAluno(aluno);
        novoTreino.setExercicio(exercicio);

        return repository.save(novoTreino);
    }


    @Override
    public Treino get(Long id) {
        return null;
    }

    @Override
    public List<Treino> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {

    }


}
