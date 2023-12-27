package Ikkinchi_Oy.dars_38;

import java.util.concurrent.atomic.AtomicInteger;

class LikesOfVideo {
    private AtomicInteger numberOflikes = new AtomicInteger(10);
    public void like(){
        numberOflikes.incrementAndGet();
    }
    public AtomicInteger getNumberOflikes(){
        return numberOflikes;
    }
}

public class Vazifa4 {
    public static void main(String[] args) throws InterruptedException {
        LikesOfVideo obj = new LikesOfVideo();

        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                obj.like();
            }).start();
        }

        Thread.sleep(100);
        System.out.println(obj.getNumberOflikes().get());
    }
}