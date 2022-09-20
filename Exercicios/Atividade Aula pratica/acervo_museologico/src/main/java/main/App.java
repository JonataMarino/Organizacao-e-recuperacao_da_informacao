package main;
import model.Cadastro;
import data.CadastroDB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;


public class App {
    public static void main(String[] args) {
        String column = "D:\\Logatti 6º Semestre\\Organização e recuperação da Informação\\Exercicios\\Atividade Aula pratica\\acervo_museologico\\csv\\acervoartepecasdocshistoricos.csv";
        try {
            Files.lines(Paths.get(column))/*.map(line -> line.split(";"))*/.forEach(System.out::println);
            //new Cadastro().setCadacervo(column);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
