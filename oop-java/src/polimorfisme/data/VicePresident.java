package polimorfisme.data;

public class VicePresident extends Manager {
    /*
    Mthod overiding menimpa metod dari class parent
    dengan nama dan param sama tapi body ny bisa beda
     */
    public VicePresident(String name){
        super(name);
    }
    public void sayHello(String name){
        System.out.println(
                "HI "+name+" ,My name is Vp " +this.name);
    }
}
