package MohirDev.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Topshiriq2 {
    public static void main(String[] args) {
        ArrayList<String> ismlar = new ArrayList<>();

        ismlar.add("Shahboz");
        ismlar.add("Sardor");
        ismlar.add("Jasur");
        ismlar.add("Alisher");
        ismlar.add("Farrux");

        // Element qidirish
        System.out.print("Qidiryotgan ismingizni kiriting: ");
        if(ismlar.contains(new Scanner(System.in).nextLine())){
            System.out.println("Qidirilgan ism ro'yxatda mavjud!");
        }
        else{
            System.out.println("Qidirilgan ism ro'yxatda mavjud emas!");
        }

        // ArrayListdan nusxa olish
        ArrayList<String> nusxa = new ArrayList<>(ismlar);

        // ArrayListni aralashtirish
        System.out.println("Original: " + nusxa);
        Collections.sort(nusxa);
        System.out.println("Aralashgan: " + nusxa);

    }
}
