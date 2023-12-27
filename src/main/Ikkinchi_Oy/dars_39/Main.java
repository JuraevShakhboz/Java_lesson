package Ikkinchi_Oy.dars_39;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

class PlastikCard {
    private AtomicReference<Double> amount = new AtomicReference<>(0D);

    public void pulQabul(Double x){
        amount.updateAndGet(v->v+x);
    }
    public void pulYechish(Double d){
        amount.updateAndGet(v->v-d);
    }

    public AtomicReference<Double> getAmount() {
        return amount;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PlastikCard obj = new PlastikCard();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100; i++) {
            executorService.submit(()->{
                obj.pulQabul(10D);
            });
            executorService.submit(()->{
                obj.pulYechish(5D);
            });
        }
        Thread.sleep(1000);
        executorService.shutdown();
        System.out.println(obj.getAmount().get());
    }
}
