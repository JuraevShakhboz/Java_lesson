package Ikkinchi_Oy.dars_35;

public class SuvOmbori {
    private Integer suvMiqdori = 0;

    public synchronized void suvMiqdoriniOshir(){
        for (int i = 0; i <= 10; i++) {
            suvMiqdori += 10;
            System.out.println(Thread.currentThread().getName() + " = " + suvMiqdori);
        }
    }
}
