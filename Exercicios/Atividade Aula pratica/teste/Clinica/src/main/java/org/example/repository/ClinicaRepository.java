package org.example.repository;

import org.example.model.Clinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clinicaRepository extends JpaRepository<Clinica, Long> {}

//estende o JpaRepository e declara a Entidade Clinica e o tipo de chave primária
