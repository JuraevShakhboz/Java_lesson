package Ikkinchi_Oy.dars_40;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ArrayBlockingQueue<Runnable> taskQueue = new ArrayBlockingQueue<>(10);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                5,
                10,
                60,
                TimeUnit.SECONDS,
                taskQueue
        );

        for (int i = 1; i <= 20; i++) {
            final int taskId = i;
            taskQueue.offer(() -> {
                System.out.println("Executing task: " + taskId);
            });
        }

        executor.prestartCoreThread();
        executor.shutdown();
    }
}
