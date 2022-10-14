package com.projeto.model;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Date;

    @Entity (name = "tbl_post") //define o nome da tabela que sera criada no banco de dados

    public class Post implements Serializable {
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(nullable = false, length = 150)// Define o propriedades da coluna
        @NotBlank (message = "Autor é uam informação obrigatória")//define a mensagem a ser exibida caso a validação da coluna falhar
        private String autor;

        @Column(nullable = false, length = 150)
        @NotBlank(message = "Titulo é uma informação obrigatória.")
        private String titulo;

        @Column(nullable = false)
        @Lob
        @NotBlank(message = "texto é uma informação obrigatória")
        private String texto;

        @Column(nullable = false)
        @Temporal(TemporalType.DATE)
        @DateTimeFormat(pattern = "yyyy/MM/dd")
        @NotNull(message = "Data é uma informação obrigatória")
        private Date date;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getTexto() {
            return texto;
        }

        public void setTexto(String texto) {
            this.texto = texto;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }

