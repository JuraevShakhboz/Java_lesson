package Ikkinchi_Oy.dars_38;

import java.util.concurrent.atomic.AtomicInteger;

class ToplaganBal {
    private AtomicInteger bal = new AtomicInteger(60);
    public void increment(){
        bal.incrementAndGet();
    }

    public AtomicInteger getBal(){
        return bal;
    }
}
public class StudentBali {
    public static void main(String[] args) {

            ToplaganBal obj  = new ToplaganBal();

            Thread t1 = new Thread(()->{
                for (int i = 0; i < 10; i++) {
                    obj.increment();
                }
            });
            Thread t2 = new Thread(()->{
                for (int i = 0; i < 10; i++) {
                    obj.increment();
                }
            });
            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(obj.getBal());
    }
}
