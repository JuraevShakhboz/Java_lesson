package Ikkinchi_Oy.dars_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static ArrayList<String> elementQoshish(ArrayList<String> Name){
        System.out.print("\nYangi ism qo'shing: ");
        Name.add(new Scanner(System.in).next());

        return Name;
    }
    public static ArrayList<String> elementOchirish(ArrayList<String> Name){
        System.out.print("\nO'chirmoqchi bo'lgan ismni kiriting: ");
        Name.remove(new Scanner(System.in).next());

        return Name;
    }

    public static void main(String[] args) {

        ArrayList<String> Name = new ArrayList<>();
        Name.add("Jasur");
        Name.add("Sanjar");
        Name.add("Alisher");
        Name.add("Oxun");
        Name.add("Begzod");
        Name.add("Ravshan");
        Name.add("Dilshod");
        Name.add("Aziz");
        Name.add("Shohrux");
        Name.add("Shahboz");

        Collections.sort(Name);
        System.out.println("-----------Sortlangan Ismlar-----------");
        for (String s : Name) {
            System.out.println(s);
        }

        elementQoshish(Name);
        elementOchirish(Name);

        for (String s : Name) {
            System.out.println(s);
        }
        System.out.println("\nJami ismlar: " + Name.size());
    }
}
