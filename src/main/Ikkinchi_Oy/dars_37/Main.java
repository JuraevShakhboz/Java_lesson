package Ikkinchi_Oy.dars_37;

import java.util.ArrayList;
import java.util.List;

class Xodim {
    private String ism;
    private String jinsi;
    private double oylikMaosh;

    public Xodim(String ism, String jinsi, double oylikMaosh) {
        this.ism = ism;
        this.jinsi = jinsi;
        this.oylikMaosh = oylikMaosh;
    }

    public double getOylikMaosh() {
        return oylikMaosh;
    }

    public String getJinsi() {
        return jinsi;
    }

    public void oylikMaoshniOshir(double foiz) {
        this.oylikMaosh *= (1 + foiz);
    }

}

public class Main {
    public static void main(String[] args) {
        List<Xodim> xodimlar = new ArrayList<>();
        xodimlar.add(new Xodim("Ali", "erkak", 250000));
        xodimlar.add(new Xodim("Nodir", "erkak", 280000));
        xodimlar.add(new Xodim("Dilorom", "ayol", 200000));
        xodimlar.add(new Xodim("Gulnoza", "ayol", 210000));

        xodimlar.stream()
                .filter(xodim -> xodim.getJinsi().equals("ayol"))
                .forEach(xodim -> xodim.oylikMaoshniOshir(0.15));


        xodimlar.stream()
                .filter(xodim -> xodim.getJinsi().equals("erkak"))
                .forEach(xodim -> xodim.oylikMaoshniOshir(0.20));

        double ortachaOylik = xodimlar.stream()
                .mapToDouble(Xodim::getOylikMaosh)
                .average()
                .orElse(0);

        System.out.println("Xodimlar o'rtacha oylik maoshlari: " + ortachaOylik);
    }
}
