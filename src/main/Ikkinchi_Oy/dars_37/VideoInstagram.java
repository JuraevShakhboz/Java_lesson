package Ikkinchi_Oy.dars_37;

import java.util.concurrent.CountDownLatch;

class Video {
    private CountDownLatch countDownLatch;

    public Video(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    public void watched(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Video ko'rildi...");
        countDownLatch.countDown();
    }
    public void top(){
        System.out.println(" top recomendatsiyaga chiqarildi");
    }
}

public class VideoInstagram {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(100);
        Video video = new Video(latch);

        for (int i = 1; i <= 150; i++) {
            new Thread(video::watched).start();
        }

        latch.await();
        System.out.print("Video 100 marta ko'rilganligi u-n:");
        video.top();
    }
}
