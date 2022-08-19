/*Escreva um algoritmo para ler o numero total de eleitores de um município, o numero de
 * votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa
 * em relação ao total de eleitores*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Eleicao e = new Eleicao();

        System.out.print("Informe o número total de eleitores do município: ");
        int nOfVoters = sc.nextInt();
        e.setnOfVoters(nOfVoters);
        System.out.print("Informe o número de votos em branco: ");
        int nVotesWhite = sc.nextInt();
        e.setnVotesWhite(nVotesWhite);


    }
}
