import java.util.Scanner;

public class Ex_04_08_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int Id;
    String Nome;
    String Telefone;
    int Idade;
    int NFilhos;
    double Salario;
    int Cargo;

        System.out.print("Informe a sua idade: ");
        Idade = sc.nextInt();
        if(Idade >= 18){
            System.out.print("Informe seu ID: ");
            Id = sc.nextInt();
            System.out.print("Informe seu nome: ");
            sc.nextLine();
            Nome = sc.nextLine();
            System.out.print("Informe seu telefone: ");
            Telefone = sc.nextLine();
            System.out.print("informe seu salário: ");
            Salario = sc.nextDouble();
            System.out.println("informe o Cargo que exerce:");
            System.out.println("Digite 1 para Colaborador");
            System.out.println("Digite 2 para Gerente");
            System.out.println("Digite 3 para Analista de sistemas");
            Cargo = sc.nextInt();
            System.out.print("Quantos filhos possui?: ");
            NFilhos = sc.nextInt();

            if (NFilhos >= 1) {
                double Acrescimo = Salario * (0.10 * NFilhos);
                Salario = Salario + Acrescimo;
                System.out.println("Seu salário teve um acréscimo de "+ Acrescimo +"R$ devido a quantidade de " + NFilhos + " filhos!");
            }

            if (Salario >= 10000 && Cargo == 2){
                double Desconto = Salario * 0.05;
                Salario = Salario - Desconto;
                System.out.println("Seu salário sofreu um desconto de " + Desconto + "R$ devido ao cargo exercido!");
                System.out.println("Olá " + Nome + ".Você tem " + Idade + " anos. Seu id é" + Id + " .Seu Salario atual é de "+ Salario +"R$ e você exerce o cargo de Gerente!");
                System.out.println("para entrarmos em contato usaremos o numero de telefone: "+ Telefone);
            }
            else if(Salario >= 10000 && Cargo == 3){
                double Desconto = Salario * 0.10;
                Salario = Salario - Desconto;
                System.out.println("Seu salário sofreu um desconto de " + Desconto + "R$ devido ao cargo exercido!");
                System.out.println("Olá " + Nome + ".Você tem " + Idade + " anos. Seu id é: " + Id +" Seu salário Atual é de "+ Salario +"R$ e voce exerce o cargo de Analista de Sistemas!");
                System.out.println("para entrarmos em contato usaremos o numero de telefone: "+ Telefone);

            }else{
                System.out.println("Olá " + Nome + ".Você tem " + Idade + " anos. Seu id é : " + Id + " seu salário atual é de " + Salario+ "R$ e voce exerco o cargo de colaborador" );
                System.out.println("para entrarmos em contato usaremos o numero de telefone: "+ Telefone);

            }

        }else
            System.out.println("Não foi possível realizar o cadastro pois você é menor de idade");

    }
}
