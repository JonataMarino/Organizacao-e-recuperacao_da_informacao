package org.example.model;
import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "tbl_especialista")
public class Especialista extends Pessoa implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Clinica clinica;
    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank(message = "certificado é uma informação obrigatória")
    private String certificado;
    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank (message = "Registro é uma informação obrigatória")
    private String registroEsp;
    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank (message = "Especialidade é uma informação obrigatória")
    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
