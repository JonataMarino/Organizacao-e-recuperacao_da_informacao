/*faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
* escreva a idade dessa pessoa expressa em dias. considere como ano 365 dias e mês como 30 dias*/
import java.util.ArrayList;
import java.util.List;

public class IdadePessoa {



    //construtor
    public IdadePessoa(String name, int years, int months, int days) {
        this.name = name;
        this.years = years;
        this.months = months;
        this.days = days;
    }
    public IdadePessoa(){}

    //atributos da classe

    private String  name;
    private int  years;
    private int  months;
    private int  days;

    //list
    List<IdadePessoa> pessoa = new ArrayList<IdadePessoa>();


    //métodos


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public List<IdadePessoa> getPessoa() {
        return pessoa;
    }

    public void setPessoa(List<IdadePessoa> pessoa) {
        this.pessoa = pessoa;
    }
}
