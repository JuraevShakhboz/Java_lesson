package Ikkinchi_Oy.dars_17;

import java.util.Scanner;
import java.util.Vector;

public class Vektor {
    Vector<String> viloyat = new Vector<String>();
    public void addEl(){
        System.out.println("Viloyatni kiriting: ");
        viloyat.add(new Scanner(System.in).next());
        System.out.println("Yana viloyat qo'shasizmi?:\n1. Ha 2. Yo'q");
        int x = new Scanner(System.in).nextInt();

        if(x == 1){
            addEl();
        }
        else if (x == 2) {
            updateEl();
        }

    }
    public void updateEl(){
        System.out.println("Qaysi viloyatni yangilaysiz?:");
        String st = new Scanner(System.in).next();
        int s = viloyat.indexOf(st);
        System.out.println(st+" ning yangi nomi:");
        viloyat.set(s, new Scanner(System.in).next());
        delEl();
    }
    public void delEl(){
        System.out.println("Qaysi viloyatni o'chirasiz:");
        viloyat.remove(new Scanner(System.in).next());
    }

    public static void main(String[] args) {

        Vektor v = new Vektor();
        v.addEl();

        System.out.println("\n---------Viloyatlar ro'yxati----------");
        for (String s : v.viloyat) {
            System.out.println(v.viloyat.indexOf(s) + 1 + ": " + s);
        }
    }
}
