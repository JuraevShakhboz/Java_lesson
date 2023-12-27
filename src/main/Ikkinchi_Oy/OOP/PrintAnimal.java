package Ikkinchi_Oy.OOP;

import java.util.Arrays;
import java.util.List;

public class PrintAnimal {
    public static void main(String[] args) {

        List<Animal> animals = Arrays.asList(
                new Animal(),
                new Dog(),
                new Cat());


        for (Animal animal : animals) {
            animal.ovozChiqarmoq();
        }
    }
}
