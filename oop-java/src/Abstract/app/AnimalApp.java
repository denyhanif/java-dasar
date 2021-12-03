package Abstract.app;

import Abstract.data.Animal;
import Abstract.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();///CONTOH POLOMORFISME
        animal.name="yupi";
        animal.run();
    }
}
