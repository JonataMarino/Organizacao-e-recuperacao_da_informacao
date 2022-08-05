import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        if (idade >= 18)
            System.out.println("Maior de idade!");
        else
            System.out.println("Menor de idade!");
    }
}
