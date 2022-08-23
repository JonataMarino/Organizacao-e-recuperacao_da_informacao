/* Uma revendedora de carros  usados paga a seus funcionários vendedores um salário fixo por
 * mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas
 * por ele efetuadas. Escreva um algoritmo que leia o Número de carros por ele vendidos, o
 * salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário
 * final do vendedor*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("####,##0.00");

    Reseller r = new Reseller();

        r.setCommission(0.05f);

        System.out.print("Informe o nome do vendedor: ");
        String name = sc.nextLine();
        r.setName(name);

        System.out.print("Informe o salário fixo do vendedor: ");
        int salary = sc.nextInt();
        r.setFixSalary(salary);

        System.out.print("Informe a comissão fixa para cada carro vendido: ");
        float fixCommission = sc.nextInt();
        r.setFixCommission(fixCommission);

        System.out.print("informe a quantidade de carros vendidos: ");
        int carSold = sc.nextInt();
        r.setCarSold(carSold);
        System.out.print("Informe o valor total de carros vendidos: ");
        int totalValue = sc.nextInt();
        r.setTotalValue(totalValue);
        if(r.getCarSold() > 0){
            fixCommission = ((r.getCarSold() * r.getFixCommission()));
            r.setFixCommission(fixCommission);

            float commission =  + (r.getTotalValue() * r.getCommission());
            r.setCommission(commission);
            r.setFinalSalary(r.getFixSalary()+ r.getFixCommission() +r.getCommission());
        }
        System.out.println("O vendedor" + r.getName() + "vendeu" + r.getCarSold() + "carros.");
        System.out.println("Devido suas vendas teve uma comissão fixa de R$" + (r.getCarSold() * r.getFixCommission()));
        System.out.println("Também obteve comissão adicional de vendas no valor de R$" + r.getCommission());
        System.out.println("Seu salário final é de R$" + df.format(r.getFinalSalary()));
        System.out.println(r);



    }
}
