public abstract class Conta {
    public Conta(){}
    public Conta(int numero, String descricao, String tipo, String dataDeAbertura){
        this.numero = numero;
        this.descricao = descricao;
        this.tipo = tipo;
        this.dataDeAbertura = dataDeAbertura;
    }
    private int numero;
    private String descricao;
    private String tipo;
    private String dataDeAbertura;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        return "Conta{" +
                "numero = '" + numero + '\''+
                ", 'descricao' = '" + descricao + '\'' +
                ", 'Conta= '" + tipo + '\'' +
                ", 'data De Abertura= '" + dataDeAbertura + '\''
                ;
    }
}
