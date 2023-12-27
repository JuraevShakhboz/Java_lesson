package Ikkinchi_Oy.dars_39;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

class Foydalanuvchilar {
    private AtomicInteger foydalanuvchi = new AtomicInteger(100);

    public void login(){
        foydalanuvchi.incrementAndGet();
    }
    public void logauot(){
        foydalanuvchi.decrementAndGet();
    }
    public AtomicInteger getFoydalanuvchi() {
        return foydalanuvchi;
    }
}

public class WevSahifa {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Foydalanuvchilar obj = new Foydalanuvchilar();

        for (int i = 0; i < 10; i++) {
            executorService.submit(()->{
                obj.login();
            });
        }
        for (int i = 0; i < 5; i++) {
            executorService.submit(()->{
                obj.logauot();
            });
        }
        Thread.sleep(1000);
        executorService.shutdown();
        System.out.println(obj.getFoydalanuvchi().get());
    }
}
