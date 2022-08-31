import java.util.Date;

public interface IConta{

    String getNumeroContaComTipo(int numeroConta, String descricao);

    int getNumeroDiasAberto(Date diaAbertura);
}