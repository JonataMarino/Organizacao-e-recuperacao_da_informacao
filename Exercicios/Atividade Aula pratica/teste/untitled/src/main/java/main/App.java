package main;

import data.CadastroDB;
import model.Cadastro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class App {
    public static void main(String[] args) {
        String column = "D:\\Logatti 6º Semestre\\Organização e recuperação da Informação\\Exercicios\\Atividade Aula pratica\\teste\\untitled\\src\\csv\\teste.csv";
        try {
            List<String[]> lst = Files.lines(Paths.get(column))
                    .map(line -> line.split(","))
                    .collect(Collectors.toList());
            List<Cadastro> lstCadastro = new ArrayList<>();
            boolean firstLine = true;
            for (String[] dado : lst) {
                if (firstLine){
                    firstLine = false;
                }else
                try {
                    Cadastro c = new Cadastro();
                    try {

                        c.setNome(dado[0]
                                .replace("\"", ""));
                        c.setPais(dado[1]
                                .replace("\"", ""));
                        c.setEstado(dado[2]
                                .replace("\"", ""));
                        c.setCidade(dado[3]
                                .replace("\"", ""));
                        c.setBairro(dado[4]
                                .replace("\"", ""));
                        c.setLogradouro(dado[5]
                                .replace("\"", ""));
                        c.setNumero((dado[6]
                                .replace("\"", "")));
                        c.setComplemento(dado[7]
                                .replace("\"", ""));

                        boolean insert = new CadastroDB().insert(c);
                        System.out.println("inserido");
                    } catch (SQLException e) {

                        throw new RuntimeException(e);
                    }

                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



            /*for (String[] dado : lst) {
                {
                    Optional<Boolean> isLineOK = Arrays.stream(dado).map(x -> x.contains("\r\n")).findFirst();
                    if (isLineOK.get()) {
                        System.out.println("oba!");

                    }
                }
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

        }
    }
*/