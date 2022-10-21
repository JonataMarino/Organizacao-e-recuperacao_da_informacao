package org.example.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EndEspecialista {

    static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank(message = "logradouro é uma informação obrigatória")
    private String logradouro;

    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank (message = "Numero é uma informação obrigatória")
    private String numero;

    @Column(nullable = false, length = 150) //define o tamanho da coluna
    private String complemento;

    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank (message = "Bairro é uma informação obrigatória")
    private String bairro;

    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank (message = "Cidade é uma informação obrigatória")
    private String cidade;

    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank (message = "Estado é uma informação obrigatória")
    private String estado;

    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank (message = "País é uma informação obrigatória")
    private String pais;

    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank (message = "CEP Clínica é uma informação obrigatória")
    private String cep;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
