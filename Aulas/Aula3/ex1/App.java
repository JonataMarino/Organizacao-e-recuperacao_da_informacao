import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IdadePessoa idade = new IdadePessoa();

        int i = 1;

        while (i == 1){
            System.out.print("Informe seu nome: ");
            String name = sc.nextLine();
            idade.setName(name);
            System.out.print("informe a sua idade em anos: ");
            int years = sc.nextInt();
            idade.setYears(years);
            System.out.print("Informe quantos meses se passaram desde seu ultimo aniversário: ");
            int months = sc.nextInt();
            idade.setMonths(months);
            System.out.print("informe quantos dias se passaram após esse mês: ");
            int days = sc.nextInt();
            idade.setDays(days);

            int idadeEmDias =( (365 * years) + (30 * months) + days );

            System.out.println("Olá " + name + " você tem " + years + " Anos");
            System.out.println("Você está a "+ idadeEmDias +" dias pisando nessa terra maldita!");

            System.out.println("Deseja calcular uma nova data?");
            System.out.print("Digite 1 para sim e 0 para não: ");
            i = sc.nextInt();
        }
    }
}
