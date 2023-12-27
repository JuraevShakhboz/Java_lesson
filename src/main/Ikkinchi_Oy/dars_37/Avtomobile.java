package Ikkinchi_Oy.dars_37;

import java.util.concurrent.Semaphore;

class Shahobcha {
    private Semaphore semaphore;

    public Shahobcha(Semaphore semaphore) {
        this.semaphore = semaphore;
    }
    public void moyQuyish(){
        System.out.println(Thread.currentThread().getName() + " navbatga keldi...");
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " ga xizmat ko'rsatilmoqda..");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " chiqib ketdi.");
        semaphore.release();
    }
}
public class Avtomobile {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(5);
        Shahobcha obj = new Shahobcha(s);

        for (int i = 0; i < 100; i++) {
            new Thread(obj::moyQuyish).start();
        }
    }
}
