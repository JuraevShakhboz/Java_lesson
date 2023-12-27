package Uchinchi_Oy.dars_41;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.stream.Collectors;

class Oquvchlar {
    private Integer id;
    private String ism;
    private Integer bal;

    public Oquvchlar(Integer id, String ism, Integer bal) {
        this.id = id;
        this.ism = ism;
        this.bal = bal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public Integer getBal() {
        return bal;
    }

    public void setBal(Integer bal) {
        this.bal = bal;
    }

    @Override
    public String toString() {
        return "Oquvchlar{" +
                "id=" + id +
                ", ism='" + ism + '\'' +
                ", bal=" + bal +
                '}';
    }
}
public class FutureTaskExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Oquvchlar> oquvchlar = new ArrayList<>();
        oquvchlar.add(new Oquvchlar(1,"Xasan", 45));
        oquvchlar.add(new Oquvchlar(2,"Xusan", 55));
        oquvchlar.add(new Oquvchlar(3,"Zuxra", 75));
        oquvchlar.add(new Oquvchlar(4,"Fotima", 15));

        FutureTask<List<Oquvchlar>> futureTask = new FutureTask<>(new Callable<List<Oquvchlar>>() {
            @Override
            public List<Oquvchlar> call() throws Exception {
                return oquvchlar.stream()
                        .filter(o-> o.getBal() >= 50)
                        .collect(Collectors.toList());
            }
        });

        new Thread(futureTask).start();

        futureTask.get()
                .stream()
                .forEach(System.out::println);
    }
}
