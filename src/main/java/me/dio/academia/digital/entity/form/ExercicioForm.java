package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExercicioForm {
    private String nome;
    private int series;
    private int repeticoes;

    private Long treinoId;
}
