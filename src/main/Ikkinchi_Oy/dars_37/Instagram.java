package Ikkinchi_Oy.dars_37;

import java.util.concurrent.CountDownLatch;

class Moderator {
    private CountDownLatch countDownLatch;
    public Moderator(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    public void spam(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Bu foydalanuvchiga spam berildi.");
        countDownLatch.countDown();
    }
    public void cheklov(){
        System.out.println(" cheklov qo'yildi");
    }

}

public class Instagram {
    public static void main(String[] args) throws InterruptedException{
        CountDownLatch latch = new CountDownLatch(3);
        Moderator obj = new Moderator(latch);

        for (int i = 1; i <= 10; i++){
            new Thread(obj::spam).start();
        }

        latch.await();
        System.out.print("Bu foydalanuvchi 3 ta spam olganligi u-n...");
        obj.cheklov();

    }
}
