public class Employee extends Person {
    private double salary;
    private Function function;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return super.toString() + " 'Salário' = '" + this.salary + "'\n 'Função': '"+ this.function+ '\'';
    }

    @Override
    public double calculateSalary() {
        this.salary = this.salary *1.3;
        return this.salary;
    }
}
