package Ikkinchi_Oy.dars_39;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class Maxsulot {
    private AtomicInteger maxsulot = new AtomicInteger(1000);
    public void buyMaxsulot(int x){
        maxsulot.updateAndGet(v->v-x);
    }
    public void addMaxsulot(int x){
        maxsulot.updateAndGet(v->v+x);
    }
    public AtomicInteger getMaxsulot() {
        return maxsulot;
    }
}

public class Vazifa3 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Maxsulot maxsulot = new Maxsulot();

        for (int i = 0; i < 100; i++) {
            service.submit(()->{
                maxsulot.buyMaxsulot(5);
            });
        }
        for (int i = 0; i < 4; i++) {
            service.submit(()->{
                maxsulot.addMaxsulot(50);
            });
        }

        Thread.sleep(1000);
        service.shutdown();
        System.out.println(maxsulot.getMaxsulot().get());

    }
}
