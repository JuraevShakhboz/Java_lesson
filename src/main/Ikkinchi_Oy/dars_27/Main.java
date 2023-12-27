package Ikkinchi_Oy.dars_27;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Xodim> xodimlar = new ArrayList<>();
        xodimlar.add(new Xodim("Alisher", 350000.0, "IT"));
        xodimlar.add(new Xodim("Sardor", 230000.0, "Bugalteriya"));
        xodimlar.add(new Xodim("Kamol", 400000.0, "IT"));
        xodimlar.add(new Xodim("Yulduz", 500000.0, "Management"));

        List<Double> oyligiOshganXodimlar = xodimlar.stream()
                .map(x -> {
                    if("IT".equals(x.getBolim())){
                        x.setSalary(x.getSalary()*1.1);
                    }
                    return x.getSalary();
                })
                .toList();

        System.out.println(oyligiOshganXodimlar);
    }
}
