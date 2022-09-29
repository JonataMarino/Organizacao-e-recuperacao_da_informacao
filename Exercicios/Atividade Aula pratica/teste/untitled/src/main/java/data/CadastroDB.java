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
        connection = Conexao.getConnetion();
    }


    public boolean insert(Cadastro cadastro) throws SQLException {
        try{
            PreparedStatement stmt = this.connection.prepareStatement("INSERT INTO tb_acervom (nome, pais, estado, cidade," +
                    "bairro, logradouro, numero, complemento) values (?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, cadastro.getNome());
            stmt.setString(2,cadastro.getPais());
            stmt.setString(3, cadastro.getEstado());
            stmt.setString(4,cadastro.getCidade());
            stmt.setString(5, cadastro.getBairro());
            stmt.setString(6,cadastro.getLogradouro());
            stmt.setString(7,cadastro.getNumero());
            stmt.setString(8, cadastro.getComplemento());


            stmt.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e.toString());

        }finally{
            connection.close();
        }
        return false;
    }

/*    public boolean update(Cadastro cadastro) throws SQLException {
        try{
            PreparedStatement stmt = this.connection.prepareStatement("UPDATE db_acervom.tb_acervom (nome, pais, estado, cidade," +
                    "bairro, logradouro, numero, complemento) (?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, cadastro.getNome());
            stmt.setString(2, cadastro.getPais());
            stmt.setString(3,cadastro.getEstado());
            stmt.setString(4,cadastro.getCidade());
            stmt.setString(5, cadastro.getBairro());
            stmt.setString(6, cadastro.getLogradouro());
            stmt.setString(7,cadastro.getNumero());
            stmt.setString(8,cadastro.getComplemento());

            stmt.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e.toString());

        }finally{
            connection.close();
        }
        return false;
    }

    public boolean delete (Cadastro cadastro) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement("DELETE FROM db_acervom.tb_acevom where ID (id)(?)");
            //stmt.setString(0, cadastro.getNome());

            stmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e.toString());

        } finally {
            connection.close();
        }
        return false;
    }*/
}