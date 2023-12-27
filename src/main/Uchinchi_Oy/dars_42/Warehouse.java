package Uchinchi_Oy.dars_42;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Product> products;

    public Warehouse() {
        this.products = new ArrayList<>();
    }


    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " omborga qo'shildi.");
    }

    public void removeProduct(Product product) {
        if (products.remove(product)) {
            System.out.println(product.getName() + " ombordan chiqarildi.");
        } else {
            System.out.println("Bunday maxsulot omborda mavjud emas.");
        }
    }

    public void listProducts() {
        System.out.println("Ombordagi maxsulotlar:");
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getQuantity() + " dona");
        }
    }
}
