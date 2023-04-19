package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Treino;
import me.dio.academia.digital.entity.form.TreinoForm;

import java.util.List;

public interface ITreinoService {
    Treino create(TreinoForm treino);

    Treino get(Long id);

    List<Treino> getAll();

    void delete(Long id);


}
