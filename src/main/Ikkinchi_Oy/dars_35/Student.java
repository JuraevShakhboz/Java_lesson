package Ikkinchi_Oy.dars_35;

public class Student {
    private Integer ball = 0;

    public synchronized void balniOshir(){
        for (int i = 1; i <= 10; i++) {
            ball++;
            System.out.println(Thread.currentThread().getName() + " ball " + ball);
        }
    }
}
