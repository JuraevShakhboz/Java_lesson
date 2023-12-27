package Ikkinchi_Oy.dars_37;

import java.util.concurrent.CountDownLatch;

class Konfirensiya {
    private CountDownLatch countDownLatch;

    public Konfirensiya(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public void konferinsiya(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Konfirensiya boshlanmoqda");
        countDownLatch.countDown();
    }
}
public class VideoKonfirensiya {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);
        Konfirensiya obj = new Konfirensiya(latch);

        for (int i = 0; i < 20; i++) {
            new Thread(obj::konferinsiya).start();
        }

        latch.await();
        System.out.println("Konfirensiya boshlandi...");
    }
}
