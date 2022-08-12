import java.util.ArrayList;
import java.util.List;

public class People {

    //construtor
    public  People(int id, String name, String telephone, int age, int nOfChildren, double salary, int cargo) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.age = age;
        this.nOfChildren = nOfChildren;
        this.salary = salary;
        this.cargo = cargo;
    }

    public People(){}

    //List

    List<People> people = new ArrayList<People>();

    //atributos da classe

    private int id;
    private String name;
    private String telephone;
    private int age;
    private int nOfChildren;
    private double salary;
    private int cargo;

    //Métodos



    public void addPeople(People p) {
        people.add(p);
    }

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getnOfChildren() {
        return nOfChildren;
    }

    public void setnOfChildren(int nOfChildren) {
        this.nOfChildren = nOfChildren;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getCargo() {
        return cargo;
    }
    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "'id'= '" + id + '\'' +
                ", 'name'= '" + name + '\'' +
                ", 'telephone'= '" + telephone + '\'' +
                ", 'age'= '" + age + '\'' +
                ", 'nOfChildren'= '" + nOfChildren + '\'' +
                ", 'salary'= '" + salary + '\'' +
                ", 'cargo'= '" + cargo + '\'' +
                '}';
    }
}

