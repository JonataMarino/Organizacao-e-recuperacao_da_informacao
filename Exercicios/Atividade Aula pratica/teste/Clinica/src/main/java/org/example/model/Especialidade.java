package org.example.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Especialidade {

        static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue( strategy = GenerationType.AUTO)
        private long id;
    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank(message = "Descrição da especialidade é uma informação obrigatória")
        private String descricao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}



