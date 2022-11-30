package org.example.model;
import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

public class Consulta implements Serializable {
    static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 150)
    private String descricao;

    private Paciente pct;

     //define o tamanho da coluna
    private Date data;

    @OneToOne
    private Clinica clinica;
    @OneToOne
    private Especialista espct;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Paciente getPct() {
        return pct;
    }

    public void setPct(Paciente pct) {
        this.pct = pct;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public Especialista getEspct() {
        return espct;
    }

    public void setEspct(Especialista espct) {
        this.espct = espct;
    }
}
