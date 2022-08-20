public class ContaPoupanca extends Conta{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    @Override
    public String toString() {
        return super.toString()  + ", 'limite' =' " + limite +
                '}';
    }
}


