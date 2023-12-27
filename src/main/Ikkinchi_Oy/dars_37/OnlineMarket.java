package Ikkinchi_Oy.dars_37;

import java.util.concurrent.CountDownLatch;

class Savdo {
    private CountDownLatch countDownLatch;

    public Savdo(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    public void buy(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Mahsulot sotib olindi...");
        countDownLatch.countDown();
    }
    public void top(){
        System.out.println("Mahsulot top rekomendatsiyasiga chiqarildi.");
    }
}
public class OnlineMarket {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(10);
        Savdo savdo = new Savdo(latch);

        for (int i = 0; i < 20; i++) {
            new Thread(savdo::buy).start();
        }

        latch.await();
        savdo.top();
    }
}
