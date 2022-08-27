public interface IConta{

    String getNumeroContaComTipo(int numeroConta, String descricao);

    int getNumeroDiasAberto(int diaAbertura, int mesAbertura, int anoAbertura);
}