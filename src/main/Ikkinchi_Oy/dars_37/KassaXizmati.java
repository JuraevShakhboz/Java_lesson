package Ikkinchi_Oy.dars_37;

import java.util.concurrent.Semaphore;

public class KassaXizmati {
    private Semaphore semaphore;

    public KassaXizmati(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void kassaXodimi(){
        System.out.println(Thread.currentThread().getName()+" navbatga keldi...");
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+" ga xizmat ko'rsatilmoqda...");
            Thread.sleep(10000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" bo'shadi");
        semaphore.release();
    }

    public static void main(String[] args) {
        Semaphore s = new Semaphore(3);
        KassaXizmati obj = new KassaXizmati(s);

        for (int i = 0; i < 10; i++) {
            new Thread(obj::kassaXodimi).start();
        }
    }
}
