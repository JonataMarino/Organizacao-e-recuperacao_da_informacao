/* Uma revendedora de carros  usados paga a seus funcionários vendedores um salário fixo por
* mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas
* por ele efetuadas. Escreva um algoritmo que leia o Número de carros por ele vendidos, o
* salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário
* final do vendedor*/


import java.util.ArrayList;
import java.util.List;

public class Reseller {
    //construtor

    public Reseller( String name, int fixSalary, int fixCommission, float commition){
        this.name = name;
        this.fixSalary = fixSalary;
        this.fixCommission = fixCommission;
        this.commission = commition;

    }
    public Reseller(){}

    //List
    List<Reseller> resseler = new ArrayList<Reseller>();

    //Atributos da classe
    private String name;
    private int fixSalary;
    private float fixCommission;
    private float commission;
    private int carSold;
    private float finalSalary;
    private int totalValue;

    //Metodos


    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public float getFinalSalary() {
        return finalSalary;
    }

    public void setFinalSalary(float finalSalary) {
        this.finalSalary = finalSalary;
    }

    public int getCarSold() {
        return carSold;
    }

    public void setCarSold(int carSold) {
        this.carSold = carSold;
    }

    public List<Reseller> getResseler() {
        return resseler;
    }

    public void setResseler(List<Reseller> resseler) {
        this.resseler = resseler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFixSalary() {
        return fixSalary;
    }

    public void setFixSalary(int fixSalary) {
        this.fixSalary = fixSalary;
    }

    public float getFixCommission() {
        return fixCommission;
    }

    public void setFixCommission(float fixCommission) {
        this.fixCommission = fixCommission;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }


    @Override
    public String toString() {
        return "Revendedor{"+
                ", 'Nome' = '" + name + '\'' +
                ", 'Salário Fixo' = 'R$" + fixSalary + '\'' +
                ", 'Comissão fixa' = 'R$" + fixCommission + '\''+
                ", 'Comissão extra' = 'R$" + commission +'\''+
                ", 'Carros vendidos = '" + carSold +'\''+
                ", 'Salário final' = 'R$" + finalSalary + '\''+
                ", 'Valor total das vendas' = 'R$" + totalValue +
                '}';
    }
}
