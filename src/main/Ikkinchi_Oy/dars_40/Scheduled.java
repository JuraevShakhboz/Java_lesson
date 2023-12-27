package Ikkinchi_Oy.dars_40;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduled {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);

        service.scheduleAtFixedRate(()->{
            System.out.println("Budilnik chalmoqda");
        }, 20, 5, TimeUnit.SECONDS);
    }
}
