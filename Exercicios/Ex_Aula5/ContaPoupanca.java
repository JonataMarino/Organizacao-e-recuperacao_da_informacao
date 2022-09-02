import java.text.DecimalFormat;

public class ContaPoupanca extends Conta{
    private double limite;

    DecimalFormat df = new DecimalFormat("####,##0.00");
    public double getLimite() {
        return limite;
    }

    @Override
    public void gerarLogTxt(String path) {

    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    @Override
    public String toString() {
        return super.toString()  + ", 'limite' = 'R$" + df.format(limite) + '}';
    }
}


