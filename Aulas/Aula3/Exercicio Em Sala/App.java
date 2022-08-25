public class App {
    public static void main(String[] args) {
        //Person person = new Person(1, "João");
        //System.out.println(person);

        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("Pedro");
        employee.setSalary(10000);
        //imprimindo IPerson
        employee.calculateSalary();
        // imprimindo Function
        employee.setFunction(new Function(1,"Analista"));
        System.out.println(employee);

        Provider provider = new Provider(3, "Aurora");
        //provider.setId(3);
        //provider.setName("Aurora");
        System.out.println(provider);

        //****************************************************
        //imprimindo Iprovider getSizeDocument
        IProvider provider2 = new Provider(4, "teste","123456789");
        System.out.println("Qtde Caracteres: " +provider2.getSizeDocument());
    }
}
