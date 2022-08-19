/*O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem
 * do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual
 * do distribuidor seja de 28% e os impostos de 45% escreva um algoritmo para ler o custo de
 * fábrica de um carro, calcular e escrever o custo final ao consumidor*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car c = new Car();
        DecimalFormat df = new DecimalFormat("####,##0.00");

        System.out.print("Informe o valor de fábrica do veículo: ");
        float valueFabric = sc.nextFloat();
        c.setValueFabric(valueFabric);

        float percDistributor = (float) (c.getValueFabric() * 0.28);
        c.setPercDistributor(percDistributor);
        float tax =(float) (c.getValueFabric() * 0.45);
        c.setTax(tax);
        float realValue = c.getValueFabric() + c.getPercDistributor() + c.getTax();



        System.out.println("O valor Final do carro é: R$"+df.format(realValue));
        System.out.println("Um valor de "+ df.format(percDistributor) +"R$ foi atribuido ao valor de fabrica pelo distribuidor.");
        System.out.println("A taxa cobrada sobre a venda do veículo foi de " + df.format(tax) +"R$");

    }
}
