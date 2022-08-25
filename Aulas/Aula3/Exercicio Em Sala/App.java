public class App {
    public static void main(String[] args) {
        //Person person = new Person(1, "João");
        //System.out.println(person);

        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("Pedro");
        employee.setSalary(10000);
        employee.calculateSalary();
        System.out.println(employee);

        Provider provider = new Provider(1, "Aurora");
        //provider.setId(3);
        //provider.setName("Aurora");
        System.out.println(provider);

        //****************************************************
        IProvider provider2 = new Provider(4, "teste","123456789");
        System.out.println("Qtde Caracteres: " +provider2.getSizeDocument());
    }
}
