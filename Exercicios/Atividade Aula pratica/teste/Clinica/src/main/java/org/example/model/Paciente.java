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
    public class Paciente {
        @Id
        @GeneratedValue( strategy = GenerationType.AUTO)
        private Long id;
        @OneToOne
        private EndPaciente adress;
        @ManyToOne
        private Clinica clinica;
        @Column(nullable = false, length = 150) //define o tamanho da coluna
        @NotBlank(message = "Nome é uma informação obrigatória")
        private String nome;
        @Column(nullable = false, length = 150) //define o tamanho da coluna
        @NotBlank (message = "telefone é uma informação obrigatória")
        private String telefone;
        @Column(nullable = false, length = 150) //define o tamanho da coluna
        @NotBlank (message = "email é uma informação obrigatória")
        private String email;
        @Column(nullable = false, length = 150) //define o tamanho da coluna
        @NotBlank (message = "Endereço é uma informação obrigatória")
        private String endereco;
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
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getTelefone() {
            return telefone;
        }
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getEndereco() {
            return endereco;
        }
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
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
