package org.example.repository;
import org.example.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface IEnderecoRepository extends JpaRepository<Endereco, Long> {}
