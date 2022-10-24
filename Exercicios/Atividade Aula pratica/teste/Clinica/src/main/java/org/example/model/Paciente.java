package org.example.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "tbl_paciente") //define o nome da tabela que sera criada no banco de dados
public class Paciente extends Pessoa implements Serializable {
   @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   /*
    @Column(nullable = false, length = 150) //define o tamanho da coluna
    @NotBlank(message = "Endereço do paciente é uma informação obrigatória")
    private String adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    /*
    /*    private EndPaciente adress;

    public EndPaciente getAdress() {
        return adress;
    }

    public void setAdress(EndPaciente adress) {
        this.adress = adress;
    }*/
}
