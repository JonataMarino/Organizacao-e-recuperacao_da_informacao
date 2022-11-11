    package org.example.model;
    import org.hibernate.validator.constraints.NotBlank;
    import javax.persistence.*;
    import java.io.Serializable;
    import javax.persistence.Entity;
    import javax.persistence.OneToOne;

    @Entity(name = "tbl_paciente") //define o nome da tabela que sera criada no banco de dados
    public class Paciente extends Pessoa implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        @OneToOne (cascade=CascadeType.ALL)
        private Endereco endereco;
        @OneToOne
        private Clinica clinica;
        @Column(nullable = false, length = 150) //define o tamanho da coluna
        @NotBlank (message = "CPF é uma informação obrigatória")
        private String documento;
        @Column(nullable = false)
        private String exames;

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
        public Endereco getEndereco() {
            return endereco;
        }
        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }
