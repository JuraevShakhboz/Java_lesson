package Ikkinchi_Oy.dars_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.BiFunction;

public class FunctionalInterface {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> f1 = (x, y) -> {
            Integer z = Math.abs(x-y);
            ArrayList<Integer> sonlar = new ArrayList<>();
            sonlar.add(x);
            sonlar.add(y);
            sonlar.add(z);
            Collections.sort(sonlar);
            return sonlar.get(2);
        };


        System.out.println(f1.apply(4, 7));
    }
}
