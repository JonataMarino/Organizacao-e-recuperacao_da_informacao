public class App {
    public static void main(String[] args) {
        //Person person = new Person(1, "João");
        //System.out.println(person);

        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("Pedro");
        employee.setSalary(10000);
        System.out.println(employee);

        Provider provider = new Provider(1, "Aurora");
        //provider.setId(3);
        //provider.setName("Aurora");
        System.out.println(provider);
    }
}
