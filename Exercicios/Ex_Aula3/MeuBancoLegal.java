import java.text.DecimalFormat;
import java.util.Scanner;

public class MeuBancoLegal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####,##0.00");
        int i = 1;
        while (i == 1) {
            System.out.println("Deseja Criar conta corrente ou poupança?");
            System.out.print("Digite 1 para conta corrente| Digite 2 para conta poupança: ");
            int decision = sc.nextInt();
            if (decision == 1) {
                ContaCorrente cc = new ContaCorrente();
                cc.setTipo("Conta Corrente");

                System.out.print("Descrição da conta - Universitária, Pessoa Física, pessoa Jurídica: ");
                sc.nextLine();
                String descricao = sc.nextLine();
                cc.setDescricao(descricao);

                System.out.print("Informe o numero da nova conta: ");
                int numero = sc.nextInt();
                cc.setNumero(numero);

                System.out.print("informe o limite de saque da conta: ");
                double limite = sc.nextFloat();
                cc.setLimite(limite);

                System.out.print("Informe a data de abertura: ");
                sc.nextLine();
                String dataAbertura = sc.nextLine();
                cc.setDataDeAbertura(dataAbertura);
                System.out.println(cc);

            }
            else if (decision == 2){
                ContaPoupanca cp = new ContaPoupanca();
                cp.setTipo("Conta Poupança");

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

                System.out.print("Informe a data de abertura: ");
                sc.nextLine();
                String dataAbertura = sc.nextLine();
                cp.setDataDeAbertura(dataAbertura);
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
