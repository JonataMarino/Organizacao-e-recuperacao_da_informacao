package org.example.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity (name = "tbl_endereco_esp")
public class EndEspecialista extends Endereco {
@OneToOne
    private Especialista especialista;

}
