    package org.example.model;
    import org.hibernate.validator.constraints.NotBlank;
    import org.springframework.format.annotation.DateTimeFormat;

    import javax.persistence.*;
    import java.io.Serializable;
    import java.util.Date;
    import javax.persistence.Entity;
    import javax.persistence.OneToOne;
    import javax.persistence.ManyToOne;
    import javax.validation.constraints.NotNull;

    @Entity(name = "tbl_paciente") //define o nome da tabela que sera criada no banco de dados
    public class Paciente extends Pessoa implements Serializable {
        @Id
        @GeneratedValue( strategy = GenerationType.AUTO)
        private Long id;
        @OneToOne
        private Endereco adress;
        @OneToOne
        private Clinica clinica;
        @Column(nullable = false, length = 150) //define o tamanho da coluna
        @NotBlank (message = "Endereço é uma informação obrigatória")
        private String documento;
        @Column(nullable = false, length = 150) //define o tamanho da coluna
        @NotBlank (message = "Endereço é uma informação obrigatória")
        private String exames;
        @Column(nullable = false)
        @Temporal(TemporalType.DATE)
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        @NotNull(message = "Data de nascimento é uma informação obrigatória")
        private Date dataNasc;
        public Date getDataNasc() {
            return dataNasc;
        }
        public void setDataNasc(Date dataNasc) {
            this.dataNasc = dataNasc;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
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
