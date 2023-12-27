package Ikkinchi_Oy.dars_29;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String em1 = "jurayev@gmail.com";
        String em2 = "doston0099@gmail.com";
        String em3 = "ali98@mail.ru";
        String em4 = "shaxboz96@gmail.com";

        Predicate<String> predicate = (email)-> email.endsWith(".com") && email.contains("@");

        System.out.println(predicate.test(em1));
    }
}
