package Ikkinchi_Oy.dars_39;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String nomi;
    private Double narxi;
    private Integer soni;

    public Product(String nomi, Double narxi, Integer soni) {
        this.nomi = nomi;
        this.narxi = narxi;
        this.soni = soni;
    }
    public Double getNarxi() {return narxi;}
    public Integer getSoni() {return soni;}
}

public class Vazifa5 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Telefon",300D, 60));
        products.add(new Product("Kompyuter",600D, 40));
        products.add(new Product("Telivizor",400D, 35));
        products.add(new Product("Klaviatura",50D, 150));

        // 50 dan ko'p bo'lgan maxsulotlar umumiy narxi
        double maxsulotJamiNarxi = products.stream()
                .filter(product -> product.getSoni() > 50)
                .mapToDouble(product-> product.getNarxi() * product.getSoni())
                .sum();

        System.out.println("50 dan ko'p bo'lgan maxsulotlar umumiy narxi: $" + maxsulotJamiNarxi);
    }
}
