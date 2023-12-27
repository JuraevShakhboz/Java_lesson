package Ikkinchi_Oy.dars_39;

class MyThread extends Thread {
    public void run() {
        System.out.println("Excends thread");
    }
}
class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable thread");
    }
}

public class CreateThreads {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        RunnableThread runnableThread = new RunnableThread();

        // Lambda thread
        Thread lambdathread = new Thread(()->{
            System.out.println("Lambda thread");
        });


        myThread.run();
        runnableThread.run();
        lambdathread.start();
    }
}


