package Uchinchi_Oy.dars_41;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class Tovarlar {
    private String nomi;
    private String turi;

    public Tovarlar(String nomi, String turi) {
        this.nomi = nomi;
        this.turi = turi;
    }

    public String getNomi() {
        return nomi;
    }

    public void setNomi(String nomi) {
        this.nomi = nomi;
    }

    public String getTuri() {
        return turi;
    }

    public void setTuri(String turi) {
        this.turi = turi;
    }

    @Override
    public String toString() {
        return "Tovarlar{" +
                "nomi='" + nomi + '\'' +
                ", turi='" + turi + '\'' +
                '}';
    }
}
public class Tovar {
    public static void main(String[] args) {
        ArrayList<Tovarlar> tovarlar = new ArrayList<>();
        tovarlar.add(new Tovarlar("olma", "meva"));
        tovarlar.add(new Tovarlar("sut", "sut"));
        tovarlar.add(new Tovarlar("pepsi", "ichimlik"));
        tovarlar.add(new Tovarlar("banan", "meva"));
        tovarlar.add(new Tovarlar("qatiq", "sut"));
        tovarlar.add(new Tovarlar("saryog", "sut"));

        FutureTask<List<Tovarlar>> futureTask = new FutureTask<>(()->{
            return tovarlar.stream()
                    .filter(t-> t.getTuri()!="sut")
                    .toList();
        });

        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(futureTask);
    }
}
