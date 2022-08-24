/*Tendo como dados de entrada o nome, a altura, o Sexo (M ou F) de uma pessoa, calcule
 * e mostre o seu peso ideal utilizando as seguintes formulas:
 * - para peso masculino: peso ideal = (72.7*altura) - 58
 * - para peso feminino: peso ideal = (62.1 * altura) - 44.7
 *
 *       inicio
 *          ler nome
 *          ler sexo
 *           se sexo = M então
 *               peso_ideal = (72 * altura) - 58
 *           se não
 *               peso_ideal = (62.1 * altura) - 44.7
 *           fim se
 *             escrever peso_ideal
 *        fim
 * */

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####,##0.00");
        int i = 1;
        IdealWeight iw = new IdealWeight();

    while (i == 1) {
        System.out.print("Informe Sexo M ou F: ");
        char sex = sc.next().charAt(0);
        iw.setSex(sex);

        if (iw.getSex() == 'm' || iw.getSex() == 'M') {
            System.out.print("Informe seu nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            iw.setName(name);
            System.out.print("Informe sua altura: ");
            double height = sc.nextDouble();
            iw.setHeight(height);
            double pesoIdeal = (72 * iw.getHeight()) - 58;
            System.out.println(name + " ,seu peso ideal é: " + df.format(pesoIdeal) + "Kg");
            System.out.print("Deseja calcular novamente?");
            System.out.print("Digite 1 para sim e 0 para não: ");
            i = sc.nextInt();

        } else if (iw.getSex() == 'f' || iw.getSex() == 'F') {
            System.out.print("Informe seu nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            iw.setName(name);
            System.out.print("Informe sua altura: ");
            double height = sc.nextDouble();
            iw.setHeight(height);
            double pesoIdeal = (62.1 * iw.getHeight()) - 44.7;
            System.out.println(name + " ,seu peso ideal é: " + df.format(pesoIdeal) + "Kg");
            System.out.print("Deseja calcular novamente?");
            System.out.print("Digite 1 para sim e 0 para não: ");
            i = sc.nextInt();

        } else {
            System.out.println("Informe dados válidos");
        }

        }
    }
}
