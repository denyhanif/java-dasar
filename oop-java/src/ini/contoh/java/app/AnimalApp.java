package ini.contoh.java.app;

import ini.contoh.java.data.Animal;
import ini.contoh.java.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();///CONTOH POLOMORFISME
        animal.name="yupi";
        animal.run();
    }
}
