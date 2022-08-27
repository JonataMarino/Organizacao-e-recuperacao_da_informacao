import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta{
    private int id;
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
List<ContaCorrente> contacorrente = new ArrayList<ContaCorrente>();

    @Override
    public String toString() {
        return super.toString()  + ", 'limite' =' " + limite +

                '}';
    }
}

