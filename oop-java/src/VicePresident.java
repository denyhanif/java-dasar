class VicePresident extends Manager {
    /*
    Mthod overiding menimpa metod dari class parent
    dengan nama dan param sama tapi body ny bisa beda
     */
    VicePresident(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println(
                "HI "+name+" ,My name is Vp " +this.name);
    }
}
