package org.example.repository;
import org.example.model.Consulta;
import org.example.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IConsultaRepository extends JpaRepository<Consulta, Long> {}


//estende o JpaRepository e declara a Entidade Consulta e o tipo de chave primária

