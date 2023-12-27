package Ikkinchi_Oy.dars_38;

enum Status {
    OTA,
    BOLA,
    ONA
}
class Qoshiq {
    private Status status = Status.OTA;
    public synchronized void Ota() {
        while (!status.equals(Status.OTA)) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + " foydalandi...");
        status = Status.BOLA;
        notifyAll();
    }

    public synchronized void Bola() {
        while (!status.equals(Status.BOLA)) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + " foydalandi...");
        status = Status.ONA;
        notifyAll();
    }

    public synchronized void Ona() {
        while (!status.equals(Status.ONA)) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + " foydalandi...");
        status = Status.OTA;
        notifyAll();
    }
}

public class Vazifa5 {
    public static void main(String[] args) throws InterruptedException {
        Qoshiq qoshiq = new Qoshiq();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                qoshiq.Ota();
            },"Ota").start();

            new Thread(() -> {
                qoshiq.Bola();
            },"Bola").start();

            new Thread(() -> {
                qoshiq.Ona();
            }, "Ona").start();
        }
    }
}