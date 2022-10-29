    package org.example.model;
    import javax.persistence.*;
    import java.io.Serializable;
    import javax.persistence.Entity;
    import javax.persistence.OneToOne;
    import javax.persistence.ManyToOne;
    @Entity(name = "tbl_paciente") //define o nome da tabela que sera criada no banco de dados
    public class Paciente extends Pessoa {
        @Id
        @GeneratedValue( strategy = GenerationType.AUTO)
        private Long id;
        @OneToOne
        private EndPaciente adress;
        @ManyToOne
        private Clinica clinica;
        @Column(nullable = false, length = 150) //define o tamanho da coluna
        private String documento;
        @Column(nullable = false, length = 150) //define o tamanho da coluna
        private String exames;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public EndPaciente getAdress() {
            return adress;
        }

        public void setAdress(EndPaciente adress) {
            this.adress = adress;
        }

        public Clinica getClinica() {
            return clinica;
        }

        public void setClinica(Clinica clinica) {
            this.clinica = clinica;
        }

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
