package org.example.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public abstract class Pessoa {

    static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank(message = "Nome da Clínica é uma informação obrigatória")
    private long id;

    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank (message = "Nome da Clínica é uma informação obrigatória")
    private String nome;

    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank (message = "Nome da Clínica é uma informação obrigatória")
    private String telefone;

    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank (message = "Nome da Clínica é uma informação obrigatória")
    private String email;

    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank (message = "Nome da Clínica é uma informação obrigatória")
    private String endereco;

    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank (message = "Nome da Clínica é uma informação obrigatória")
    private Date dataNasc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
}
