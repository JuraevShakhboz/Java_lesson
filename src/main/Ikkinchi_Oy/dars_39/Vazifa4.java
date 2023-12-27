package Ikkinchi_Oy.dars_39;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

class Kassa {
    private AtomicReference<Double> amount = new AtomicReference<>(0D);

    public void onlaynTushum(Double x){
        System.out.println(Thread.currentThread().getName()+": $"+x);
        amount.updateAndGet(v-> v + x);
    }
    public void naqdTushum(Double x){
        System.out.println(Thread.currentThread().getName()+": $"+x);
        amount.updateAndGet(v-> v + x);
    }
    public void naqdChiqim(Double x){
        System.out.println(Thread.currentThread().getName()+": $"+x);
        amount.updateAndGet(v-> v - x);
    }
    public AtomicReference<Double> getAmount() {
        return amount;
    }
}
public class Vazifa4 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Kassa kassa = new Kassa();

        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                kassa.onlaynTushum(100D);
            },"Online Tushum").start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                kassa.naqdTushum(500D);
            },"Naqd Tushum").start();
        }
        for (int i = 0; i < 8; i++) {
            new Thread(()->{
                kassa.naqdChiqim(100D);
            },"Naqd Chiqim").start();
        }

        Thread.sleep(100);
        service.shutdown();
        System.out.println("\nJami: $"+kassa.getAmount().get());
    }
}
