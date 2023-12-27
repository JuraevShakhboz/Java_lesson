package Uchinchi_Oy.dars_45;

import java.util.ArrayList;
import java.util.List;

class Xodimlar {
    private String ism;
    private Double oylik;

    public Xodimlar(String ism, Double oylik) {
        this.ism = ism;
        this.oylik = oylik;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public Double getOylik() {
        return oylik;
    }

    public void setOylik(Double oylik) {
        this.oylik = oylik;
    }

    @Override
    public String toString() {
        return "Xodimlar{" +
                "ism='" + ism + '\'' +
                ", oylik=" + oylik +
                '}';
    }
}

public class Topshiriq1 {
    public static void main(String[] args) {
        List<Xodimlar> xodimList = new ArrayList<>();
        xodimList.add(new Xodimlar("Ali", 200D));
        xodimList.add(new Xodimlar("Vali", 250D));
        xodimList.add(new Xodimlar("Xasan", 800D));
        xodimList.add(new Xodimlar("Xusan", 650D));
        xodimList.add(new Xodimlar("Fotima", 1000D));
        xodimList.add(new Xodimlar("Zuxra", 300D));

        xodimList.parallelStream()
                .map(x-> {
                    if(x.getOylik()>300){
                        x.setOylik(x.getOylik()*0.9);
                    }
                    return x;
                })
                .forEach(System.out::println);

    }
}
