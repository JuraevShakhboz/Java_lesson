package Ikkinchi_Oy.dars_38;

import java.util.concurrent.atomic.AtomicReference;

class Oylik {
    private AtomicReference<Double> oylik = new AtomicReference<>(100D);
    public void oylikOshir(Double x){
        oylik.updateAndGet(v->v+x);
    }
    public AtomicReference<Double> getOylik(){
        return oylik;
    }
}
public class Employee {
    public static void main(String[] args) throws InterruptedException {

        Oylik obj = new Oylik();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                obj.oylikOshir(10D);
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                obj.oylikOshir(10D);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj.getOylik());
    }
}
