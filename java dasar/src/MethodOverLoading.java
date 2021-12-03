public class MethodOverLoading {
    public static void main(String[] args) {

        System.out.println("methodOverloading == nama fungsi sama , di bedakan denga parameter nya");

        hallo();
        hallo("deny");
        hallo("deny",90);

    }
    static void hallo(){
        System.out.println("hallo aja");
    }
    static void hallo(String nama){
        System.out.println("hello"+nama);

    }

    static void hallo(String firtsName, int age){
        System.out.println("hallo"+firtsName);
        System.out.println("age"+age);
    }
}
