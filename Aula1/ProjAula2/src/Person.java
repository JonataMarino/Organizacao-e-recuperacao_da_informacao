import java.util.ArrayList;
import java.util.List;

public class Person {
    //Construtor
    public Person(int id, String name, String telephone, String adress, String fatherName, String motherName, int numberOfChildren){
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.adress = adress;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.numberOfChildren = numberOfChildren;
    }
    public Person (){}
    //List
    List<Person> people = new ArrayList<Person>();
    //Atributos da classe
    private int id;
    private String name;
    private String telephone;
    private String adress;
    private String fatherName;
    private String motherName;
    private int numberOfChildren;

    //Métodos
    public void addPerson(Person p){
        people.add(p);
    }

    public List<Person> getPeople(){
        return people;
    }

    public void setPeople(List<Person> people) {
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    @Override
            public String toString() {
        return "Person{" +
                ", Id=" + id +
                ", Name='" + name + '\'' +
                ", Telephone='" + telephone + '\'' +
                ", Adress='" + adress + '\'' +
                ", FatherName='" + fatherName + '\'' +
                ", MotherName='" + motherName + '\'' +
                ", NumberOfChildren=" + numberOfChildren +
                '}';
    }
}

