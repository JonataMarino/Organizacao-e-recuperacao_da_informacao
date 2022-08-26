public abstract class Conta implements IConta {
    public Conta(){}



    public Conta(int numero, String descricao, String tipo, String dataDeAbertura){
        this.numero = numero;
        this.descricao = descricao;
        this.tipo = tipo;
        this.dataDeAbertura = dataDeAbertura;
    }

    private int id;
    private int numero;
    private String descricao;
    private String tipo;
    private String dataDeAbertura;

    public int getNumero() {
        return numero;
    }

    @Override
    public String printTipo(int numero, String descricao) {
        return "'Numero' = " +this.numero + " 'Descrição': "+ this.descricao+" ";
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    @Override
    public String toString() {
        return "{" + printTipo(this.numero, this.descricao) + '\'' +
                "'Id = '" + id + '\''+
                ", 'data De Abertura= '" + dataDeAbertura + '\''
                ;
    }
}
