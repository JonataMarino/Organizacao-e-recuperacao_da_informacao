import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####,##0.00");
        int i = 1;
        People p = new People();

        while (i == 1) {

            System.out.print("informe sua idade: ");
            int age = sc.nextInt();
            p.setAge(age);
            if (p.getAge() < 18) {
                System.out.println("Não foi possível completar a consulta pois você não tem maoridade!");
            } else {

                System.out.print("informe seu id: ");
                int id = sc.nextInt();
                p.setId(id);

                System.out.print("Informe seu nome: ");
                sc.nextLine();
                String name = sc.nextLine();
                p.setName(name);

                System.out.print("Informe seu telefone: ");
                String telephone = sc.nextLine();
                p.setTelephone(telephone);

                System.out.print("informe a quantidade de filhos que possui: ");
                int nOfChildren = sc.nextInt();
                p.setnOfChildren(nOfChildren);

                System.out.print("Informe seu salário: ");
                double salary = sc.nextDouble();
                p.setSalary(salary);

                System.out.println("Informe o cargo que exerce:");
                System.out.println("Digite 1 para colaborador");
                System.out.println("Digite 2 para gerente");
                System.out.println("Digite 3 para Analista de Sistemas");
                System.out.print(":");
                int cargo = sc.nextInt();
                p.setCargo(cargo);
                if (cargo ==0 || cargo >=4) {
                    System.out.println("Informe um Cargo Válido!!");
                    System.out.print("Cargo: ");
                    cargo = sc.nextInt();
                    p.setCargo(cargo);
                }
                else if (p.getnOfChildren() >= 1) {
                    double salario = p.getSalary();
                    double acrescimo = salario * (0.10 * p.getnOfChildren());
                    p.setSalary(salario + acrescimo);
                    System.out.println("Seu salário teve um acréscimo de " +  df.format(acrescimo) + "R$ devido a quatidade de " + p.getnOfChildren() + " filhos.");

                }

                if ( p.getCargo() == 2 ) {
                    double salario = p.getSalary();
                    System.out.println("Olá " + p.getName() + "! Você tem " + p.getAge() + " anos de idade e seu id é: " + p.getId());
                    System.out.println("Você exerce o cargo de Gerente!");
                    if(p.getSalary() >= 10000){
                        double desconto = p.getSalary() * 0.1;
                        p.setSalary(salario - desconto);
                        System.out.println("Seu salário sofreu um desconto fiscal de R$ " + df.format(desconto) + " devido ao cargo exercido!");
                    }
                    System.out.println("Seu salário atual é de RS" + df.format(p.getSalary()));
                    System.out.println("para entrarmos em contato usaremos o telefone: " + p.getTelephone());
                    System.out.println("Você exerce o cargo de Analista de sistemas!");
                }
                else if ( p.getCargo() == 3) {
                    System.out.println("Olá " + p.getName() + "! Você tem " + p.getAge() + " anos de idade e seu id é: " + p.getId());
                    System.out.println("Você exerce o cargo de Analista de Sistemas!");
                    double salario = p.getSalary();
                    if(p.getSalary() >= 10000){
                        double desconto = p.getSalary() * 0.1;
                        p.setSalary(salario - desconto);
                        System.out.println("Seu salário sofreu um desconto fiscal de R$ " + df.format(desconto) + " devido ao cargo exercido!");
                    }
                    System.out.println("Seu salário atual é de R$" + df.format(p.getSalary()));
                    System.out.println("para entrarmos em contato usaremos o telefone: " + p.getTelephone());
                } else if (p.getCargo() == 1) {
                    System.out.println("Olá " + p.getName() + "! Você tem " + p.getAge() + " anos de idade e seu id é: " + p.getId());
                    System.out.println("Você exerce o cargo de Colaborador!");
                    System.out.println("Seu salário atual é de R$" + df.format(p.getSalary()));
                    System.out.println("Para entrarmos em contato usaremos o número " + p.getTelephone());
                }
            }
            System.out.println("Deseja calcular sua renda novamente?");
            System.out.print("Digite 1 para sim e 0 para não: ");
            i = sc.nextInt();
            if (i != 0 && i != 1){
                System.out.println("Digite um número válido?");
                System.out.print("Digite 1 para sim e 0 para não: ");
                i = sc.nextInt();

            }
        }
    }
}
