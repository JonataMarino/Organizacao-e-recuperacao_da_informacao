public class App {
    public static void main(String[] args) {
        Person p = new Person();
        p.setId(1);
        p.setName("José");
        p.setAdress("Rua 1");
        p.setFatherName("João");
        p.setMotherName("Maria");
        p.setNumberOfChildren(2);
        p.setTelephone("16 99999 8888");


        Person p2 = new Person(2,"Bruna", "16 99999 8888", "Rua 2", "Pedro", "Marina", 2 );

        p.addPerson(p);
        p.addPerson(p2);

     /*   for (Person person: p.getPeople()){
            System.out.println((person));
        } */

       p.getPeople().forEach(System.out::println);

    }
}
