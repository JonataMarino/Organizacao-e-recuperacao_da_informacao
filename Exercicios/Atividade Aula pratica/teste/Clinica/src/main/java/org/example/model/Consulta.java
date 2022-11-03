package org.example.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.Date;

public class Consulta {
    static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank(message = "Descrição da consulta é obrigatória")
    private String descrição;

    private Paciente pct;

    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank (message = "Obrigatório informar a data da consulta")

    private Date data;

    private Clinica clinica;
    private Especialista espct;

}
