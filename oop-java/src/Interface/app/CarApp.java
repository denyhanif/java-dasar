package Interface.app;

import Interface.data.Car;
import Interface.data.Datsun;

public class CarApp {
    public static void main(String[] args) {

        Datsun datsu = new Datsun();
        datsu.drive();
        datsu.isMaintenance();
        //Car car = new Car(); Car eroor tidak bisa di instansi karn ainterface
        //agar Car bisa di intenace guankan polomorfisme
        Car car= new Datsun();//polomorfisme
        car.getTier();
        car.getBrands();

    }
}
