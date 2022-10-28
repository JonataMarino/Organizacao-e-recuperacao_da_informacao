    package org.example.model;
    import javax.persistence.*;
    import java.io.Serializable;

    @Entity(name = "tbl_paciente") //define o nome da tabela que sera criada no banco de dados
    public class Paciente extends Pessoa implements Serializable {
      private String documento;
      @Column (nullable = false)
      private String exames;

        public Clinica getClinica() {
            return clinica;
        }

        public void setClinica(Clinica clinica) {
            this.clinica = clinica;
        }

        @ManyToOne
      private Clinica clinica;
        public String getDocumento() {
            return documento;
        }
        public void setDocumento(String documento) {
            this.documento = documento;
        }
        public String getExames() {
            return exames;
        }
        public void setExames(String exames) {
            this.exames = exames;
        }
    }
