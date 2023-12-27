package Ikkinchi_Oy.dars_17;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorIsmlar {
    Scanner s = new Scanner(System.in);
    Vector<String> ismlar = new Vector<>();

    public void addIsm(){
        System.out.println("Ism kiriting:");
        ismlar.add(s.next());
        System.out.println("Yana ism qo'shasizmi?\n1. Ha 2. Yo'q");
        int x = s.nextInt();
        if(x == 1){
            addIsm();
        } else if (x == 2) {
            Collections.sort(ismlar);
            System.out.println("\n-------Ismlar ro'yxati-------");
            for (String s1 : ismlar) {
                System.out.println(ismlar.indexOf(s1)+1+": "+s1);
            }
            System.out.println();
            updateIsm();
        }
    }
    public void updateIsm(){
        System.out.println("Yangi ism kiriting:");
        ismlar.add(s.next());
        System.out.println("Yana yangi ism qo'shasizmi?\n1. Ha 2. Yo'q");
        int x1 = s.nextInt();
        if (x1 == 1) {
            updateIsm();
        } else if (x1 == 2) {
            deleteIsm();
        }
    }
    public void deleteIsm(){
        System.out.println("Qaysi ismni o'chirasiz?");
        ismlar.remove(s.next());
        System.out.println("Yana o'chirasizmi?\n1. Ha 2. Yo'q");
        int x2 = s.nextInt();
        if(x2 == 1){
            deleteIsm();
        } else if (x2 == 2) {
            searchIsm();
        }
    }

    public void searchIsm(){
        Collections.sort(ismlar);
        System.out.println("Qidarayotgan ismingiz?");
        String st = s.next();
        if(ismlar.contains(st)){
            System.out.println(ismlar.indexOf(st)+1+": "+st+" listda mavjud");
        }
        else {
            System.out.println("Ism topilmadi!");
        }
    }
    public static void main(String[] args) {
        VectorIsmlar ob = new VectorIsmlar();

        ob.addIsm();
        System.out.println("\n-------Ismlar ro'yxati-------");
        Collections.sort(ob.ismlar);
        for (String s : ob.ismlar) {
            System.out.println(ob.ismlar.indexOf(s)+1+": "+s);
        }
    }
}
