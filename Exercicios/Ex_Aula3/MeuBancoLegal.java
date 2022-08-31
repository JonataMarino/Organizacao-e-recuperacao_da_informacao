import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class MeuBancoLegal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i == 1) {
            Calendar calendar = Calendar.getInstance();
            System.out.println("Deseja Criar conta corrente ou poupança?");
            System.out.print("Digite 1 para conta corrente| Digite 2 para conta poupança: ");
            int decision = sc.nextInt();
            if (decision == 1) {
                ContaCorrente cc = new ContaCorrente();
                cc.setTipo("Conta Corrente");
                Calendar abertura = Calendar.getInstance();
                SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");

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
                int dia = sc.nextInt();
                cc.setDiaAbertura(dia);
                System.out.print("Informe o mês de abertura: ");
                int mes = sc.nextInt();
                cc.setMesAbertura(mes);
                System.out.print("Informe o ano de abertura: ");
                int ano = sc.nextInt();
                cc.setAnoAbertura(ano);
                abertura.set(dia, mes, ano);
                cc.setDataAbertura(abertura.getTime());
                System.out.println(cc);



            }
            else if (decision == 2){
                ContaPoupanca cp = new ContaPoupanca();
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
                int dia = sc.nextInt();
                cp.setDiaAbertura(dia);
                System.out.print("Informe o mês de abertura: ");
                int mes = sc.nextInt();
                cp.setMesAbertura(mes);
                System.out.print("Informe o ano de abertura: ");
                int ano = sc.nextInt();
                cp.setAnoAbertura(ano);
                abertura.set(ano, mes, dia);
                cp.setDataAbertura(abertura.getTime());
                System.out.println(cp);


            }
            System.out.println("deseja Registrar outra conta? ");
            System.out.print("digite 1 para sim e 0 para não: ");
            i = sc.nextInt();
            while (i < 0 || i >1 ){
                System.out.println("deseja Registrar outra conta? ");
                System.out.print("digite 1 para sim e 0 para não: ");
                i = sc.nextInt();
            }
        }
    }
}
