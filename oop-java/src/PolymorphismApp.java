public class PolymorphismApp {
    public static void main(String[] args) {
        //
        /*
        contoh polimorfisme ->
        var employee(yang bertipe Employee line 11) berubah bentuk dapat di gunakan sebagai var instansiasi untk objec lain)
        var employee berubah bentuk dari satu object ke object lain
        dari Employee() ke Manager() ke VicePresident()
         */

        Employee employee = new Employee("Eko");
        employee.sayHello("Budi");

        // var employee sebagai instan manager
        employee = new Manager("Eko");
        employee.sayHello("Budi");

        // var employee sebagai instan Vicepresiden
        employee = new VicePresident("eko");
        employee.sayHello("Budi");

        //polomorfisme pada method
        sayHello(new Employee("EKo"));
        sayHello(new Manager("Eko"));
        sayHello(new VicePresident("Eko"));


    }

    /*
    Jika ingin menmbangakn method baru ke smua objek
    dengan adanya polimofrisme tidak perlu satu persatu
    kita tidak perlu melakukan sperti ini

    static void sayHello(Employee employee){
        System.out.println("Hai"+employee.name);
    }
    static void sayHello(Manager manager){
        System.out.println("Hai"+manager.name);
    }
    static void sayHello(VicePresident vicePresident){
        System.out.println("Hai"+vicePresident.name);
    }
     */
    /* cukup ddengan seperti di bawah ini
    * Karena Class Employee merupakan induk dari semua class*/
//    static void sayHello(Employee employee){
//        System.out.println("Hai"+employee.name);
//    }
    /*
    TYPE CHECH AND CAST(konfersi data)
    untuk mengechek apakah object yg di kirim
    sesuai parameter atau tidak dg keyword instace of
     */

    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident inivicePresident = (VicePresident) employee;
            System.out.println("hello vp "+ inivicePresident.name);
        }
        else if(employee instanceof Manager ){
            Manager imanager = (VicePresident) employee;
            System.out.println("hello manager "+imanager.name);
        }
    }

}
