package Ikkinchi_Oy.dars_31;

public class UzCard {
    public  double balans = 0;

    public void increment(double x){
        balans += x;
        System.out.println("Balans " + x + " ga oshirildi");
    }
    public void decriment(double y){
        balans -= y;
        System.out.println("Balans " + y + " ga kamaytirildi");
    }
}
