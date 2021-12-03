public class MethodParameter {
    public static void main(String[] args) {

        sayHello("deny",20);
    }

    static  void sayHello( String firstName, Integer lastName){
        System.out.println("Hello "+firstName+" "+lastName);
    }
}
