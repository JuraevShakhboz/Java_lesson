package Ikkinchi_Oy.dars_35;

public class Abonent {
    private Double balans = 10000D;

    public synchronized void balabsKamay(){
        for (int i = 1; i <= 10; i++) {
            balans -= 10;
            System.out.println(Thread.currentThread().getName() + " Balans: " + balans);
        }
    }
}
