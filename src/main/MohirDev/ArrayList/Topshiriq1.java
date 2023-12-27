package MohirDev.ArrayList;

import java.util.ArrayList;

public class Topshiriq1 {
    public static void main(String[] args) {
        ArrayList<String> ranglar = new ArrayList<>();

        ranglar.add("WHITE");
        ranglar.add("BLACK");
        ranglar.add("BLUE");
        ranglar.add("GREEN");
        ranglar.add("RED");
        ranglar.add("ORANGE");
        ranglar.add("YELLOW");

        System.out.println("Ranglar: " + ranglar);

        ranglar.set(0, "GOLD");

        System.out.println("Birinchi rang o'zgartirildi: " + ranglar);

        System.out.println("\nRanglar o'lchami:");
        for (String s : ranglar) {
            System.out.println(s + ": " + s.length());
        }
    }
}
