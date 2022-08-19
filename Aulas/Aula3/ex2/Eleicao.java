import java.util.ArrayList;
import java.util.List;

public class Eleicao {

    //construtor

    public Eleicao(int nOfEleitores, int nVotesWhite, int nVotesNull, int nVotesValids){
        this.nOfVoters = nOfEleitores;
        this.nVotesWhite = nVotesWhite;
        this.nVotesNull = nVotesNull;
        this.nVotesValids = nVotesValids;
    }
    public Eleicao(){}

    //list

    List<Eleicao> eleicao = new ArrayList<Eleicao>();

    //atributos da classe

    private int nOfVoters;
    private int nVotesWhite;
    private int nVotesNull;
    private int nVotesValids;

    //metodos


    public List<Eleicao> getEleicao() {
        return eleicao;
    }

    public void setEleicao(List<Eleicao> eleicao) {
        this.eleicao = eleicao;
    }

    public int getnOfVoters() {
        return nOfVoters;
    }

    public void setnOfVoters(int nOfVoters) {
        this.nOfVoters = nOfVoters;
    }

    public int getnVotesWhite() {
        return nVotesWhite;
    }

    public void setnVotesWhite(int nVotesWhite) {
        this.nVotesWhite = nVotesWhite;
    }

    public int getnVotesNull() {
        return nVotesNull;
    }

    public void setnVotesNull(int nVotesNull) {
        this.nVotesNull = nVotesNull;
    }

    public int getnVotesValids() {
        return nVotesValids;
    }

    public void setnVotesValids(int nVotesValids) {
        this.nVotesValids = nVotesValids;
    }

    @Override
    public String toString() {
        return "Eleicao{" +
                ", 'Numero de Eleitores'= '" + nOfVoters +'\'' +
                ", 'Votos Brancos' =" + nVotesWhite +'\'' +
                ", 'Votos Nulos' =" + nVotesNull +'\'' +
                ", 'Votos Validos' =" + nVotesValids +'\'' +
                '}';
    }
}
