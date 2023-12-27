package Ikkinchi_Oy.dars_35;

public class VirtualHamyon {
    private Double pulMiqdori = 0D;

    public void pulMiqdoriniOshir(){
        for (int i = 0; i <= 10; i++) {
            pulMiqdori += 100000;
            System.out.println(Thread.currentThread().getName() + " = "+pulMiqdori);
        }
    }
}
