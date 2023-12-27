package Ikkinchi_Oy.dars_38;

import java.util.concurrent.atomic.AtomicReference;

class Bank {
    private AtomicReference<Double> amount = new AtomicReference<>(1000D);
    public void spent(Double x){
        amount.updateAndGet(v->v-x);
    }
    public void income(Double d){
        amount.updateAndGet(v->v+d);
    }

    public AtomicReference<Double> getAmount(){
        return amount;
    }
}
public class Vazifa3 {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();

        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                bank.income(1D);
            }).start();

            new Thread(()->{
                bank.spent(2D);
            }).start();
        }

        Thread.sleep(1000);
        System.out.println(bank.getAmount().get());
    }
}
