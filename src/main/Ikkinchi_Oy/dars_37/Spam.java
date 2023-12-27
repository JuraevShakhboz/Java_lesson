package Ikkinchi_Oy.dars_37;

import java.util.concurrent.CountDownLatch;

class SpamInfo {
    private CountDownLatch countDownLatch;

    public SpamInfo(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public void cheklash(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Spam bosildi...");
        countDownLatch.countDown();
    }

    public void chek(){
        System.out.println("Bu user cheklandi !");
    }
}
public class Spam {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        SpamInfo spamInfo = new SpamInfo(latch);

        for (int i = 0; i < 10; i++) {
            new Thread(spamInfo::cheklash).start();
        }

        latch.await();
        System.out.println("Davom etmoqda...");
        spamInfo.chek();
    }
}
