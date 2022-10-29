package org.example.repository;

import org.example.model.Especialista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface IEspecialistaRepository extends JpaRepository<Especialista, Long> {}

//estende o JpaRepository e declara a Entidade paciente e o tipo de chave primária

