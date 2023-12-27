package Uchinchi_Oy.dars_42;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        try {
            File file = new File("files/maxsulotlar.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                String name = parts[0];
                double quantity = Double.parseDouble(parts[1]);
                double unitPrice = Double.parseDouble(parts[2]);

                Product product = new Product(name, quantity, unitPrice);
                warehouse.addProduct(product);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fayl topilmadi.");
            e.printStackTrace();
        }

        warehouse.listProducts();

        Product productToRemove = new Product("Maxsulot nomi", 0, 0);
        warehouse.removeProduct(productToRemove);

        warehouse.listProducts();
    }
}
