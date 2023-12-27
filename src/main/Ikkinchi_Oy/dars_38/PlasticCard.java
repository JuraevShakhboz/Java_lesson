package Ikkinchi_Oy.dars_38;

import java.util.concurrent.atomic.AtomicReference;

class Card {
    private AtomicReference<Double> amount = new AtomicReference<>(1000D);
    public void oshituvchi(Double x) {
        amount.updateAndGet(v -> v + x);
    }
    public void kamaytiruvchi(Double x){
        amount.updateAndGet(v-> v - x);
    }
    public AtomicReference<Double> getAmount(){
        return amount;
    }
}
public class PlasticCard {
    public static void main(String[] args) throws InterruptedException {
        Card card = new Card();

        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                card.oshituvchi(5D);
            }).start();

            new Thread(()->{
                card.kamaytiruvchi(10D);
            }).start();
        }

        Thread.sleep(1000);
        System.out.println(card.getAmount().get());
    }
}
