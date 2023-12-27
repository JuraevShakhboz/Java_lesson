package Ikkinchi_Oy.dars_29;

import java.util.List;

public class Topshiriq3 {
    public static void main(String[] args) {
        List<String> ismlar = List.of(
                "Alisher",
                "Sardor",
                "Kamol",
                "Bobur",
                "Akmal",
                "Shahboz",
                "Azizbek"
        );

        ismlar.stream()
                .filter(x-> x.startsWith("A"))
                .forEach(System.out::println);

    }
}
