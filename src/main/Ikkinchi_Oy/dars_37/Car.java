package Ikkinchi_Oy.dars_37;

import java.util.concurrent.CountDownLatch;

public class Car {
    private CountDownLatch countDownLatch;
    public Car(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    public void balonAlmashtir(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e){
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(4);
        Car obj = new Car(latch);
        for (int i = 0; i < 10; i++) {
            new Thread(obj::balonAlmashtir).start();
        }

        System.out.println("kutib turmoqda");
        latch.countDown();
    }
}
