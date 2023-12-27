package Ikkinchi_Oy.dars_37;

import java.util.concurrent.CountDownLatch;

class JavaCourse {
    private CountDownLatch countDownLatch;

    public JavaCourse(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    public void buyJavaCourse(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Java kursi sotib olindi...");
        countDownLatch.countDown();
    }
    public void top(){
        System.out.println("Java kursi top rekomendatsiyasiga chiqarildi.");
    }
}
public class OnlineKurslar {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(10);
        JavaCourse java = new JavaCourse(latch);

        for (int i = 0; i < 20; i++) {
            new Thread(java::buyJavaCourse).start();
        }

        latch.await();
        java.top();
    }
}
