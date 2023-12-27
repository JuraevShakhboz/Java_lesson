package Ikkinchi_Oy.dars_38;

import java.util.concurrent.atomic.AtomicInteger;

class Sotuv {
    private AtomicInteger mahsulot = new AtomicInteger(1000);

    public void mahsulotKamaydi(int x){
        mahsulot.updateAndGet(v->v-x);
    }
    public AtomicInteger getMahsulot(){
        return mahsulot;
    }
}
public class OnlineSavdo {
    public static void main(String[] args) throws InterruptedException {
        Sotuv obj = new Sotuv();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                obj.mahsulotKamaydi(5);
            }).start();
            new Thread(() -> {
                obj.mahsulotKamaydi(5);
            }).start();

        }
        Thread.sleep(1000);
        System.out.println(obj.getMahsulot().get());
    }
}
