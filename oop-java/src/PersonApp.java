public class PersonApp {
    public static void main(String[] args) {
        /*
        Object kumpualan dari Propertird/field/attribut dan fungction/method
         */
        //cara penulisa object

        var person1 = new Person();
        person1.name="deny";
        person1.address="indonesia";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Eko");

        Person person2 = new Person();
        person2.name="ali";
        person2.address="jakal";
        person2.sayHello("amdp");

        Person personConstructor;
        // wajib di tambahakan param sesuai dengan osntruktor
        personConstructor = new Person("Budi","magelanag");
        personConstructor.sayHello("Ibud");


    }
}
