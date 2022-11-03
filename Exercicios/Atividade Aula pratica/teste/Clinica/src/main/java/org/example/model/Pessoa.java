    package org.example.model;
    import org.hibernate.validator.constraints.NotBlank;
    import org.springframework.format.annotation.DateTimeFormat;
    import javax.persistence.*;
    import javax.validation.constraints.NotNull;
    import java.io.Serializable;
    import java.util.Date;
    public abstract class Pessoa implements Serializable {
        //@Id
        //@GeneratedValue( strategy = GenerationType.AUTO)
        //private Long id;
        @Column(nullable = false, length = 150) //define o tamanho da coluna
        @NotBlank (message = "Nome é uma informação obrigatória")
        private String nome;
        @Column(nullable = false, length = 150) //define o tamanho da coluna
        @NotBlank (message = "telefone é uma informação obrigatória")
        private String telefone;
        @Column(nullable = false, length = 150) //define o tamanho da coluna
        @NotBlank (message = "email é uma informação obrigatória")
        private String email;
        @OneToOne
        @Column(nullable = false, length = 150) //define o tamanho da coluna
        @NotBlank (message = "Endereço é uma informação obrigatória")
        private Endereco adress;
        @Column(nullable = false)
        @Temporal(TemporalType.DATE)
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        @NotNull(message = "Data de nascimento é uma informação obrigatória")
        private Date dataNasc;
      /*  public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }*/
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

        public Endereco getAdress() {
            return adress;
        }

        public void setAdress(Endereco adress) {
            this.adress = adress;
        }

        public Date getDataNasc() {
            return dataNasc;
        }
        public void setDataNasc(Date dataNasc) {
            this.dataNasc = dataNasc;
        }
    }
