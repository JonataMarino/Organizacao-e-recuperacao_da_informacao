package org.example.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity(name = "tbl_especialista")
public class Especialista extends Pessoa {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private EndEspecialista adress;
    @ManyToOne
    private Clinica clinica;
    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank(message = "certificado é uma informação obrigatória")
    private String certificado;
    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank (message = "Registro é uma informação obrigatória")
    private String registroEsp;

    public EndEspecialista getAdress() {
        return adress;
    }


    public void setAdress(EndEspecialista adress) {
        this.adress = adress;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getRegistroEsp() {
        return registroEsp;
    }

    public void setRegistroEsp(String registroEsp) {
        this.registroEsp = registroEsp;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

}
