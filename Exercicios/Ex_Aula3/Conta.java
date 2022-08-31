import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public abstract class Conta implements IConta {
    public Conta(){}



    public Conta(int numero, String descricao, String tipo, Date dataAbertura, int diaAbertura, int mesAbertura, int anoAbertura){
        this.numero = numero;
        this.descricao = descricao;
        this.tipo = tipo;
        this.diaAbertura = diaAbertura;
        this.mesAbertura = mesAbertura;
        this.anoAbertura = anoAbertura;
        this.dataAbertura = dataAbertura;
    }

    private int id;
    private int numero;
    private String descricao;
    private String tipo;
    private int diaAbertura;
    private int mesAbertura;
    private int anoAbertura;

    private Date dataAbertura;



    public int getNumero() {
        return numero;
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

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    @Override
    public String getNumeroContaComTipo(int numeroConta, String tipoConta) {
        this.numero = numeroConta;
        this.tipo = tipoConta;
        return "'Conta Numero': '" + numero + "' 'Tipo': '" + tipo;
    }

    @Override
    public int getNumeroDiasAberto(Date diaAbertura) {
        Date dataAtual = Date.from(Calendar.getInstance().toInstant());
        return (int) ChronoUnit.DAYS.between(dataAtual.toInstant(), getDataAbertura().toInstant());
    }

    @Override
    public String toString() {
        return "{" + getNumeroContaComTipo(this.getNumero(), this.getTipo()) + '\'' +
                new Tipo(this.getId(), this.getDescricao()) +
                ", 'data De Abertura' = '" + getDiaAbertura() +  "\\" + getMesAbertura() + "\\" + getAnoAbertura()+ '\'' + " }\n"
                + "{Sua conta esta a "+ getNumeroDiasAberto(getDataAbertura()) + " dias aberta!";
    }
}
