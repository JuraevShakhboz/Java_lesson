package Ikkinchi_Oy.dars_29;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Topshiriq4 {
    public static void main(String[] args) {
        Supplier<Long> supplier = new Supplier<Long>() {
            private long prev = 0;
            private long current = 1;
            @Override
            public Long get() {
                long next = prev + current;
                prev = current;
                current = next;
                return prev;
            }
        };

        Stream
                .generate(supplier)
                .limit(15)
                .forEach(System.out::println);
    }
}
