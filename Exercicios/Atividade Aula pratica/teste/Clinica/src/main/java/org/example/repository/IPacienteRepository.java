package org.example.repository;
import org.example.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface IPacienteRepository extends JpaRepository<Paciente, Long> {}

//estende o JpaRepository e declara a Entidade paciente e o tipo de chave primária

