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

    private float nOfVoters;
    private float nVotesWhite;
    private float nVotesNull;
    private float nVotesValids;

    //metodos


    public List<Eleicao> getEleicao() {
        return eleicao;
    }

    public void setEleicao(List<Eleicao> eleicao) {
        this.eleicao = eleicao;
    }

    public float getnOfVoters() {
        return nOfVoters;
    }

    public void setnOfVoters(float nOfVoters) {
        this.nOfVoters = nOfVoters;
    }

    public float getnVotesWhite() {
        return nVotesWhite;
    }

    public void setnVotesWhite(float nVotesWhite) {
        this.nVotesWhite = nVotesWhite;
    }

    public float getnVotesNull() {
        return nVotesNull;
    }

    public void setnVotesNull(float nVotesNull) {
        this.nVotesNull = nVotesNull;
    }

    public float getnVotesValids() {
        return nVotesValids;
    }

    public void setnVotesValids(float nVotesValids) {
        this.nVotesValids = nVotesValids;
    }

    @Override
    public String toString() {
        return "Eleicao{" +
                ", 'Numero de Eleitores'= '" + nOfVoters +'\'' +
                ", 'Votos Brancos' = '" + nVotesWhite +'\'' +
                ", 'Votos Nulos' = '" + nVotesNull +'\'' +
                ", 'Votos Validos' = '" + nVotesValids +'\'' +
                '}';
    }
}
