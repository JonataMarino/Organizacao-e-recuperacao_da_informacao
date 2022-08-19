/*Escreva um algoritmo para ler o numero total de eleitores de um município, o numero de
 * votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa
 * em relação ao total de eleitores*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####,##0.00");
        int i = 1;

        Eleicao e = new Eleicao();

    while (i == 1) {
        do {
            System.out.print("Informe o número total de eleitores do município: ");
            float nOfVoters = sc.nextFloat();
            e.setnOfVoters(nOfVoters);
            System.out.print("Informe o número de votos em branco: ");
            float nVotesWhite = sc.nextFloat();
            e.setnVotesWhite(nVotesWhite);
            System.out.print("Informe o número de votos nulos: ");
            float nVotesNull = sc.nextFloat();
            e.setnVotesNull(nVotesNull);
            System.out.print("informe o numero de votos validos: ");
            float nVotesValids = sc.nextFloat();
            e.setnVotesValids(nVotesValids);
            if(e.getnOfVoters() != (e.getnVotesWhite() + e.getnVotesNull() + e.getnVotesValids())){
            System.out.println("informe Valores compatíveis com o numero de eleitores!");
            }


        }while (e.getnOfVoters() != (e.getnVotesWhite() + e.getnVotesNull() + e.getnVotesValids())); {
            float percentWhite = (((e.getnVotesWhite()) / e.getnVotesValids()) / 100)*100;
            System.out.println("Pocentagem de votos brancos: "+ /*df.format*/(percentWhite) + "%");

            float percentNull = (((e.getnVotesNull() / e.getnVotesValids()) /100 ) * 100);
            System.out.println("Pocentagem de votos nulos: "+ /*df.format*/(percentNull) + "%");

            float percentValid = ((e.getnOfVoters() - e.getnVotesNull() - e.getnVotesWhite()) / 100)*100;
            System.out.println("Pocentagem de votos validos: "+ /*df.format*/(percentValid) + "%");


            e.getEleicao().forEach(System.out::println);

            System.out.println("Deseja recalcular a votação??");
            System.out.print("Digite 1 para sim e 0 para não: ");
            i = sc.nextInt();
        }
    }
    }
}
