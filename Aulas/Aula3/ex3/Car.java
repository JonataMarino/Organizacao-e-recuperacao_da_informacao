/*O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem
* do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual
* do distribuidor seja de 28% e os impostos de 45% escreva um algoritmo para ler o custo de
* fábrica de um carro, calcular e escrever o custo final ao consumidor*/

import java.util.ArrayList;
import java.util.List;

public class Car {
    //construtor
    public Car (float valueFabric, float percDistributor, float tax){
    this.valueFabric = valueFabric;
    this.percDistributor = percDistributor;
    this.tax = tax;
    }
    public Car(){}
    List<Car> car = new ArrayList<Car>();
    private float valueFabric;
    private float percDistributor;
    private float tax;

    //métodos




    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    public float getValueFabric() {
        return valueFabric;
    }

    public void setValueFabric(float valueFabric) {
        this.valueFabric = valueFabric;
    }

    public float getPercDistributor() {
        return percDistributor;
    }

    public void setPercDistributor(float percDistributor) {
        this.percDistributor = percDistributor;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Car{" +
                "'value car' = '" + car + '\''+
                ", 'value Fabric' = '" + valueFabric + '\''+
                ", 'percentage Distributor' = '" + percDistributor + '\''+
                ", 'tax' = '" + tax +
                '}';
    }
}

