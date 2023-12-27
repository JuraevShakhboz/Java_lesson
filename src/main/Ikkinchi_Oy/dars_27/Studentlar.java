package Ikkinchi_Oy.dars_27;

import java.util.List;
import java.util.ArrayList;

public class Studentlar {
    public static void main(String[] args) {
        List<ImtihondanOtganStudentlar> studentlar = new ArrayList<>();
        studentlar.add(new ImtihondanOtganStudentlar("Akmal", 23, 28.8, 2100000.0));
        studentlar.add(new ImtihondanOtganStudentlar("Bobur", 20, 98.0, 2000000.0));
        studentlar.add(new ImtihondanOtganStudentlar("Asror", 26, 75.5, 2400000.0));
        studentlar.add(new ImtihondanOtganStudentlar("Jasur", 22, 83.1, 2100000.0));

        studentlar.stream()
                .map(x -> {
                    if(x.getToplaganBali() <= 100 && x.getToplaganBali() >= 90){
                        x.setTolovSummasi(x.getTolovSummasi()*0.5);
                    }
                    if(x.getToplaganBali() < 90 && x.getToplaganBali() >= 60){
                        x.setTolovSummasi(x.getTolovSummasi()*0.9);
                    }
                    if(x.getToplaganBali() < 40 && x.getToplaganBali() >= 20){
                        x.setTolovSummasi(x.getTolovSummasi()*1.5);
                    }
                    return x;
                })
                .forEach(x -> System.out.println(x));
    }
}
