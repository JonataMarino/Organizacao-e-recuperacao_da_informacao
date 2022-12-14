import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

public class MeuBancoLegal {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String path = "D:\\Logatti 6º Semestre\\Organização e recuperação da Informação\\Exercicios\\Ex_Aula5\\txt\\contas.txt";

        int i = 1;
        while (i == 1) {
            System.out.println("Deseja Criar conta corrente ou poupança?");
            System.out.print("Digite 1 para conta corrente | Digite 2 para conta poupança: ");
            int decision = sc.nextInt();
            if (decision == 1) {
                ContaCorrente cc = new ContaCorrente();
                cc.setTipo("Conta Corrente");
                LocalDate dt = LocalDate.now();
                Calendar abertura = Calendar.getInstance();

                System.out.print("Descrição da conta - Universitária, Pessoa Física, pessoa Jurídica: ");
                sc.nextLine();
                String descricao = sc.nextLine();
                cc.setDescricao(descricao);

                System.out.print("Informe um ID para a nova conta: ");
                int id = sc.nextInt();
                cc.setId(id);

                System.out.print("Informe o numero da nova conta: ");
                int numero = sc.nextInt();
                cc.setNumero(numero);

                System.out.print("informe o limite de saque da conta: ");
                double limite = sc.nextFloat();
                cc.setLimite(limite);
                System.out.println("Informe a data de abertura: ");
                System.out.print("Dia: ");
                String dia = sc.next();
                cc.setDiaAbertura(dia);
                System.out.print("Informe o mês de abertura: ");
                String mes = sc.next();
                cc.setMesAbertura(mes);
                System.out.print("Informe o ano de abertura: ");
                String ano = sc.next();
                cc.setAnoAbertura(ano);
                LocalDate inputDate = LocalDate.parse('"' + cc.getAnoAbertura() + "-" + cc.getMesAbertura() + "-" + cc.getDiaAbertura()+ '"');
                int diff = Period.between(inputDate, dt).getDays();
                System.out.println(diff);
                cc.setDiff(diff);
                System.out.println(cc);
                cc.gerarLogTxt(cc.getId(), cc.getNumero(), cc.getTipo(), cc.getDescricao(), cc.getDataAbertura());
                cc.leitor(path);

            } else if (decision == 2) {
                ContaPoupanca cp = new ContaPoupanca();
                LocalDate dt = LocalDate.now();
                Calendar abertura = Calendar.getInstance();
                cp.setTipo("Conta Poupança");
                System.out.print("Informe um ID para a nova conta: ");
                int id = sc.nextInt();
                cp.setId(id);

                System.out.print("Descrição da conta - Conjunta | Investimento | Previdência Privada: ");
                sc.nextLine();
                String descricao = sc.nextLine();
                cp.setDescricao(descricao);

                System.out.print("Informe o numero da nova conta: ");
                int numero = sc.nextInt();
                cp.setNumero(numero);

                System.out.print("informe o limite de saque da conta: ");
                double limite = sc.nextFloat();
                cp.setLimite(limite);

                System.out.println("Informe a data de abertura: ");
                System.out.print("Dia: ");
                String dia = sc.next();
                cp.setDiaAbertura(dia);
                System.out.print("Informe o mês de abertura: ");
                String mes = sc.next();
                cp.setMesAbertura(mes);
                System.out.print("Informe o ano de abertura: ");
                String ano = sc.next();
                cp.setAnoAbertura(ano);
                //abertura.set(ano, mes, dia);
                LocalDate inputDate = LocalDate.parse('"' + cp.getAnoAbertura() + "-" + cp.getMesAbertura() + "-" + cp.getDiaAbertura()+ '"');                int diff = Period.between(inputDate, dt).getDays();
                cp.setDiff(diff);
                System.out.println(cp);
                cp.gerarLogTxt(cp.getId(), cp.getNumero(), cp.getTipo(), cp.getDescricao(), cp.getDataAbertura());
                cp.leitor(path);
                }
                System.out.println("deseja Registrar outra conta? ");
                System.out.print("digite 1 para sim e 0 para não: ");
                i = sc.nextInt();
                while (i < 0 || i > 1) {
                    System.out.println("deseja Registrar outra conta? ");
                    System.out.print("digite 1 para sim e 0 para não: ");
                    i = sc.nextInt();
                }
        }
    }
}

