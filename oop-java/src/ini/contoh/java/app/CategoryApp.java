package ini.contoh.java.app;

import ini.contoh.java.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var categ = new Category();
        categ.setId("ID");
        categ.setId(null);

        System.out.println(categ.getId());
        //output akan tetap ID karena null akan di reject pada method setid 
    }
}
