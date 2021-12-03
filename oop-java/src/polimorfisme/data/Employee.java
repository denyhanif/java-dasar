package polimorfisme.data;


public class Employee {
    public String name;

    public Employee(String name){
        this.name= name;

    }

    public void sayHello(String name){
        System.out.println("Hi " +name+"My Name is Employee"+this.name);
    }
}
