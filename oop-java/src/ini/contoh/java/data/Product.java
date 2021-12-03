package ini.contoh.java.data;

/*
di java ada 4 (public,protected,no modifier,private)
*public = ahnaya boleh satu class dalam satu file, nama file juga hrs sama dng nama class
 */
public class Product {
    public String name;
    protected int price;

    public Product(String name, int price){
        this.name= name;
        this.price=price;
    }
}
