package Ikkinchi_Oy.dars_38;

import java.util.concurrent.atomic.AtomicInteger;

class Uzum {
    private AtomicInteger maxsulot = new AtomicInteger(100);
    public void sotibOlish(int n){
        maxsulot.updateAndGet(v->v-n);
    }
    public AtomicInteger getMaxsulot(){
        return maxsulot;
    }
}

public class Vazifa2 {
    public static void main(String[] args) throws InterruptedException {
        Uzum uzum = new Uzum();

        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                uzum.sotibOlish(2);
            }).start();
        }

        Thread.sleep(100);
        System.out.println(uzum.getMaxsulot().get());
    }
}
