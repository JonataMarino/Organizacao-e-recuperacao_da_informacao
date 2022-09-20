package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Cadastro {

    private int codigo;
    private String titulo;
    private String subtitulo;
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
    static List<Cadastro> cadacervo = new ArrayList<Cadastro>();

    public  List<Cadastro> getCadacervo() {
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

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
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

    public void gerarDadosDB(int codigo, String titulo, String subtitulo, String informacao, String unidade, String estado_conservacao, String situacao, int numero_tombamento, String subcolecao, String tipologia, String cedido_a, Date data_limite_cessao){
        String column = "D:\\Logatti 6º Semestre\\Organização e recuperação da Informação\\Exercicios\\Atividade Aula pratica\\acervo_museologico\\csv\\acervoartepecasdocshistoricos.csv";
        this.codigo = codigo;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.informacao = informacao;
        this.unidade = unidade;
        this.estado_conservacao = estado_conservacao;
        this.situacao = situacao;
        this.numero_tombamento = numero_tombamento;
        this.colecao = colecao;
        this.subcolecao = subcolecao;
        this.tipologia = tipologia;
        this.cedido_a = cedido_a;
        this.data_limite_cessao = data_limite_cessao;


    }

}
