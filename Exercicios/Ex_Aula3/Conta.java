public abstract class Conta implements IConta {
    public Conta(){}



    public Conta(int numero, String descricao, String tipo, int diaAbertura, int mesAbertura, int anoAbertura){
        this.numero = numero;
        this.descricao = descricao;
        this.tipo = tipo;
        this.diaAbertura = diaAbertura;
        this.mesAbertura = mesAbertura;
        this.anoAbertura = anoAbertura;

    }

    private int id;
    private int numero;
    private String descricao;
    private String tipo;
    private int diaAbertura;
    private int mesAbertura;
    private int anoAbertura;

    public int getNumero() {
        return numero;
    }


    public int getDiaAbertura() {
        return diaAbertura;
    }

    public void setDiaAbertura(int diaAbertura) {
        this.diaAbertura = diaAbertura;
    }

    public int getMesAbertura() {
        return mesAbertura;
    }

    public void setMesAbertura(int mesAbertura) {
        this.mesAbertura = mesAbertura;
    }

    public int getAnoAbertura() {
        return anoAbertura;
    }

    public void setAnoAbertura(int anoAbertura) {
        this.anoAbertura = anoAbertura;
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

    @Override
    public String getNumeroContaComTipo(int numeroConta, String descricao) {
        this.numero = numeroConta;
        this.descricao = descricao;
        return "'Conta Numero': " + numero + " 'Tipo': " + descricao;
    }

    @Override
    public int getNumeroDiasAberto() {
        return 0;
    }

    @Override
    public String toString() {
        return "{" + getNumeroContaComTipo(this.numero, this.descricao) + '\'' +
                " 'Id = '" + id + '\''+
                ", 'data De Abertura= '" + diaAbertura+"\\"+mesAbertura+"\\"+anoAbertura + '\'' + "\n"
                + "Sua conta esta a "+ getNumeroDiasAberto() + " dias aberta!";
    }
}
