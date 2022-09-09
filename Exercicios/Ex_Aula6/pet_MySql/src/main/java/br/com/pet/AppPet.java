package br.com.pet;
import br.com.pet.data.CadastroDB;
import br.com.pet.model.Cadastro;
import java.sql.SQLException;
import java.util.Scanner;

public class AppPet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro c = new Cadastro();
        boolean i = true;
        //c.setName("Pandora");
        //c.setRaca("Akita");
        while (i == true) {
            System.out.print("informe o nome do seu pet: ");
            String name = sc.nextLine();
            c.setName(name);

            System.out.print("Informe a raça do seu pet: ");
            String raca = sc.nextLine();
            c.setRaca(raca);

            try {
                new CadastroDB().insert(c);
                System.out.println("Registro Inserido");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.print("Deseja inserir outro pet?");
            System.out.print("Digite 1 para sim: ");
            int opcao = sc.nextInt();
                if(opcao == 1){
                    i = true;
                }else
                    i = false;

        }
    }
}
