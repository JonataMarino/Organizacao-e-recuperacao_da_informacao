import java.text.DecimalFormat;

public class ContaCorrente extends Conta{
    private double limite;

    DecimalFormat df = new DecimalFormat("####,##0.00");

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return super.toString()  + ", 'limite' =' " + df.format(limite) + '}';
    }
}

