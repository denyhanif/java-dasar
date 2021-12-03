package ini.contoh.java.data;

public class ProductApp {
    public static void main(String[] args) {
        Product prod = new Product("mac",1000);

        System.out.println(prod.name);
        System.out.println(prod.price);
    }
}
