package br.com.pet.data;
import br.com.pet.model.Cadastro;
import br.com.pet.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastroDB {

    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;

    public CadastroDB() {
    connection = Conexao.getConnetion();

    }

    public boolean insert(Cadastro cadastro) throws SQLException {
    try {
        PreparedStatement stmt = this.connection.prepareStatement("INSERT INTO tb_pets (name, raca) values (?, ?)");

        stmt.setString(1, cadastro.getName());
        stmt.setString(2, cadastro.getRaca());

        stmt.execute();
        return true;
    } catch (SQLException e){
        System.err.println(e.toString());

    }finally{
        connection.close();

    }
    return false;
    }
}
