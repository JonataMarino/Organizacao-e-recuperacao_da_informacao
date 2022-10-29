package org.example.model;
import javax.persistence.*;
@Entity(name = "tbl_endereco_pac")
public class EndPaciente extends Endereco {
        @OneToOne
        @JoinColumn(name = "paciente_id")
        private Paciente paciente;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}

