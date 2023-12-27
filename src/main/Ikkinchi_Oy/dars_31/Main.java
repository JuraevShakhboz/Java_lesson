package Ikkinchi_Oy.dars_31;

public class Main {
    public static void main(String[] args) {
        Yangilik news = new Yangilik();

        Thread syncThread1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                news.increaseLikeSync();
            }
        });

        Thread syncThread2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                news.increaseLikeSync();
            }
        });

        Thread asyncThread1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                news.increaseLikeAsync();
            }
        });

        Thread asyncThread2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                news.increaseLikeAsync();
            }
        });

        syncThread1.start();
        syncThread2.start();
        asyncThread1.start();
        asyncThread2.start();
    }
}
