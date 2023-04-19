package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExercicioRepository extends JpaRepository<Exercicio,Long> {
}
