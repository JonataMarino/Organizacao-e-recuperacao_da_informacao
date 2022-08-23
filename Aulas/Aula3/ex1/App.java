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

           do {
               System.out.print("Informe quantos meses se passaram desde seu ultimo aniversário: ");
               int months = sc.nextInt();
               idade.setMonths(months);
               if (idade.getMonths() > 11) {
                   System.out.println("informe um valor menor que 12 né meu chapa, 12 meses é um ano!");
               }
           }while (idade.getMonths() > 11);

           do {
               System.out.print("informe quantos dias se passaram após esse mês: ");
               int days = sc.nextInt();
               idade.setDays(days);
               if(idade.getDays() > 29) {
                   System.out.println("Nesse Calculo um mês corresponde à 30 dias");
               }
           }while (idade.getDays()> 29);

            int idadeEmDias =( (365 * idade.getYears()) + (30 * idade.getMonths()) + idade.getDays() );

            System.out.println("Olá " + idade.getName()+ " você tem " + idade.getYears() + " Anos");
            System.out.println("Você está a "+ idadeEmDias +" dias pisando nessa terra maldita!");
            System.out.println(idade);
            System.out.println("Deseja calcular uma nova data?");
            System.out.print("Digite 1 para sim e 0 para não: ");
            i = sc.nextInt();
        }
    }
}
