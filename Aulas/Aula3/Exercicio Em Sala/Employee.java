public class Employee extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return super.toString() + "Salário= '" + this.salary + "'}";
    }

    @Override
    public double calculateSalary() {
        this.salary = this.salary *1.3;
        return this.salary;
    }
}
