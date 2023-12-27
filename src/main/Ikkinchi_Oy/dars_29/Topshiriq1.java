package Ikkinchi_Oy.dars_29;

import java.util.List;

public class Topshiriq1 {
    public static void main(String[] args) {
        List<Integer> sonlar = List.of(
                1, 2, 4, 5, 6, 7, 8, 9, 12, 13, 33, 44, 55, 91
        );

        sonlar.stream()
                .filter(x-> x % 2 == 0)
                .forEach(System.out::println);

    }

}
