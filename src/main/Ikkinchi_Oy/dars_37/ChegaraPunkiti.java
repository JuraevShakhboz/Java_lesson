package Ikkinchi_Oy.dars_37;

import java.util.concurrent.Semaphore;

class YukOtkazish {
    private Semaphore semaphore;

    public YukOtkazish(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void punkit(){
        System.out.println(Thread.currentThread().getName() + " navbatga keldi...");
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " tekshirilmoqda...");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " chegaradan o'tdi.");
        semaphore.release();
    }

}
public class ChegaraPunkiti {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(2);
        YukOtkazish obj = new YukOtkazish(s);

        for (int i = 0; i < 15; i++) {
            new Thread(obj::punkit).start();
        }
    }
}
