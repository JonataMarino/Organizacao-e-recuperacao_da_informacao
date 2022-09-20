package data;
import model.Cadastro;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastroDB {
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;

    public CadastroDB(){
        connection = Conexao.getConnection();
    }
    

    public boolean insert(Cadastro cadastro) throws SQLException {
        try{
            PreparedStatement stmt = this.connection.prepareStatement("INSERT INTO db_acervom.tb_acervom (código, título, subtítulo, informacao, unidade, estadodeconservacao, situacao, numero_tombamento, colecao, subcolecao, tipologia, cedido a, data limite da cessao) (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?");
            stmt.setInt(1, cadastro.getCodigo());
            stmt.setString(2, cadastro.getTitulo());
            stmt.setString(3, cadastro.getSubtitulo());
            stmt.setString(4, cadastro.getInformacao());
            stmt.setString(5,cadastro.getUnidade());
            stmt.setString(6,cadastro.getEstado_conservacao());
            stmt.setString(7, cadastro.getSituacao());
            stmt.setInt(8,cadastro.getNumero_tombamento());
            stmt.setString(9, cadastro.getColecao());
            stmt.setString(10,cadastro.getSubcolecao());
            stmt.setString(11,cadastro.getTipologia());
            stmt.setString(12,cadastro.getCedido_a());


            stmt.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e.toString());

        }finally{
            connection.close();
        }
        return false;
    }
    public boolean update(Cadastro cadastro) throws SQLException {
        try{
            PreparedStatement stmt = this.connection.prepareStatement("UPDATE tb_acervom (código, título, subtítulo, informacao, unidade, estadodeconservacao, situacao, numero_tombamento, colecao, subcolecao, tipologia, cedido a, data limite da cessao) (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?");
            stmt.setInt(1, cadastro.getCodigo());
            stmt.setString(2, cadastro.getTitulo());
            stmt.setString(3, cadastro.getSubtitulo());
            stmt.setString(4, cadastro.getInformacao());
            stmt.setString(5,cadastro.getUnidade());
            stmt.setString(6,cadastro.getEstado_conservacao());
            stmt.setString(7, cadastro.getSituacao());
            stmt.setInt(8,cadastro.getNumero_tombamento());
            stmt.setString(9, cadastro.getColecao());
            stmt.setString(10,cadastro.getSubcolecao());
            stmt.setString(11,cadastro.getTipologia());
            stmt.setString(12,cadastro.getCedido_a());


            stmt.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e.toString());

        }finally{
            connection.close();
        }
        return false;
    }
}
