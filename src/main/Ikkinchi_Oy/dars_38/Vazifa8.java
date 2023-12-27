package Ikkinchi_Oy.dars_38;

import java.util.concurrent.Semaphore;
class XizmatKorsatish {
    private Semaphore semaphore;

    public XizmatKorsatish(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void kassa(){
        System.out.println(Thread.currentThread().getName() + " mijoz kassaga keldi :)");
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " ga xizmat ko'rsatilmoqda...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " ga xizmat ko'rsatildi.");
        semaphore.release();
    }
}
public class Vazifa8 {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(3);
        XizmatKorsatish obj = new XizmatKorsatish(s);

        for (int i = 0; i < 100; i++) {
            new Thread(obj::kassa).start();
        }
    }
}
