package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Cadastro {

    private int codigo;
    private String titulo;
    private String subtitlulo;
    private String informacao;
    private String unidade;
    private String estado_conservacao;
    private String situacao;
    private int numero_tombamento;
    private String colecao;
    private String subcolecao;
    private String tipologia;
    private String cedido_a;
    private Date data_limite_cessao;

    public Cadastro(){}
    List<Cadastro> cadacervo = new ArrayList<Cadastro>();

    public List<Cadastro> getCadacervo() {
        return cadacervo;
    }

    public void setCadacervo(List<Cadastro> cadacervo) {
        this.cadacervo = cadacervo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitlulo() {
        return subtitlulo;
    }

    public void setSubtitlulo(String subtitlulo) {
        this.subtitlulo = subtitlulo;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getEstado_conservacao() {
        return estado_conservacao;
    }

    public void setEstado_conservacao(String estado_conservacao) {
        this.estado_conservacao = estado_conservacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getNumero_tombamento() {
        return numero_tombamento;
    }

    public void setNumero_tombamento(int numero_tombamento) {
        this.numero_tombamento = numero_tombamento;
    }

    public String getColecao() {
        return colecao;
    }

    public void setColecao(String colecao) {
        this.colecao = colecao;
    }

    public String getSubcolecao() {
        return subcolecao;
    }

    public void setSubcolecao(String subcolecao) {
        this.subcolecao = subcolecao;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getCedido_a() {
        return cedido_a;
    }

    public void setCedido_a(String cedido_a) {
        this.cedido_a = cedido_a;
    }

    public Date getData_limite_cessao() {
        return data_limite_cessao;
    }

    public void setData_limite_cessao(Date data_limite_cessao) {
        this.data_limite_cessao = data_limite_cessao;
    }
}