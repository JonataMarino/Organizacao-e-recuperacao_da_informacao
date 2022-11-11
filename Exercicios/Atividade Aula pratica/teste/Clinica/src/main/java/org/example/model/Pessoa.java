    package org.example.model;
    import org.hibernate.validator.constraints.NotBlank;
    import org.springframework.format.annotation.DateTimeFormat;
    import javax.persistence.*;
    import java.io.Serializable;
    import java.util.Date;


    public abstract  class Pessoa implements Serializable {

        @Column(nullable = false, length = 150) //define o tamanho da coluna
        @NotBlank (message = "Nome é uma informação obrigatória")
        private String nome;
        @Column(nullable = false, length = 150) //define o tamanho da coluna
        @NotBlank (message = "telefone é uma informação obrigatória")
        private String telefone;
        @Column(nullable = false, length = 150) //define o tamanho da coluna
        @NotBlank (message = "email é uma informação obrigatória")
        private String email;

        @Column(nullable = false)
        @Temporal(TemporalType.DATE)
        @DateTimeFormat(pattern = "yyyy-MM-dd")
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

        public Date getDataNasc() {
            return dataNasc;
        }
        public void setDataNasc(Date dataNasc) {
            this.dataNasc = dataNasc;
        }

    }
