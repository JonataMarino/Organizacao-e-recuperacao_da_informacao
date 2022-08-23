/*Tendo como dados de entrada o nome, a altura, o Sexo (M ou F) de uma pessoa, calcule
 * e mostre o seu peso ideal utilizando as seguintes formulas:
 * - para peso masculino: peso ideal = (72.7*altura) - 58
 * - para peso feminino: peso ideal = (62.1 * altura) - 44.7
 *
 *       inicio
 *          ler nome
 *          ler sexo
 *           se sexo = M então
 *               peso_ideal = (72 * altura) - 58
 *           se não
 *               peso_ideal = (62.1 * altura) - 44.7
 *           fim se
 *             escrever peso_ideal
 *        fim
 * */
import java.util.ArrayList;
import java.util.List;

public class IdealWeight {

    public IdealWeight(String name, char sex, double weight){
        this.name = name;
        this.sex = sex;
        this.weight = weight;

    }
    public IdealWeight(){}

    private String name;
    private char sex;
    private double weight;

    List<IdealWeight> idealweight = new ArrayList<IdealWeight>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public List<IdealWeight> getIdealweight() {
        return idealweight;
    }

    public void setIdealweight(List<IdealWeight> idealweight) {
        this.idealweight = idealweight;
    }
}
