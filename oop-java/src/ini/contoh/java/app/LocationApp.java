package ini.contoh.java.app;

import ini.contoh.java.data.City;
import ini.contoh.java.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        //Location location = new Location();//Eror karena abstrac ticak bisa di buat object

        City city = new City();
        city.name= "Kabul";
        System.out.println(city.name);
    }
}
