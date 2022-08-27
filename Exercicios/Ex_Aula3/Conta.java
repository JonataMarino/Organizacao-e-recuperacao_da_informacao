import java.util.Calendar;

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
    public String getNumeroContaComTipo(int numeroConta, String tipoConta) {
        this.numero = numeroConta;
        this.tipo = tipoConta;
        return "'Conta Numero': '" + numero + "' 'Tipo': '" + tipo;
    }

    @Override
    public int getNumeroDiasAberto(int diaAbertura, int mesAbertura, int anoAbertura) {
        Calendar dataCadastro = Calendar.getInstance();
        this.diaAbertura = diaAbertura;
        this.mesAbertura = mesAbertura;
        this.anoAbertura = anoAbertura;
        dataCadastro.set (anoAbertura, mesAbertura, diaAbertura);
        Calendar hoje = Calendar.getInstance();

        int diasAberta = ( (hoje.get(Calendar.YEAR) *12 + hoje.get(Calendar.MONTH) *30 + hoje.get(Calendar.DAY_OF_MONTH) ) - (dataCadastro.get(Calendar.YEAR) * 12 + dataCadastro.get(Calendar.MONTH) *30 + dataCadastro.get(Calendar.DAY_OF_MONTH)) );
        return diasAberta;
    }

    @Override
    public String toString() {
        return "{" + getNumeroContaComTipo(this.numero, this.tipo) + '\'' +
                new Tipo(this.id, this.descricao) +
                ", 'data De Abertura= '" + diaAbertura+"\\"+mesAbertura+"\\"+anoAbertura + '\'' + "}\n"
                + "{Sua conta esta a "+ getNumeroDiasAberto(diaAbertura, mesAbertura, anoAbertura) + " dias aberta!";
    }
}
