package Ikkinchi_Oy.dars_davomida;

import java.util.*;
import java.util.function.Consumer;

public class SavdoDokoni {
    public static void main(String[] args) {
        Map<String, Double> maxsulotlar = new HashMap<>();
        maxsulotlar.put("un", 7000.0);
        maxsulotlar.put("shakar", 15000.0);
        maxsulotlar.put("guruch", 13000.0);
        maxsulotlar.put("yog'", 18000.0);

        double kassa = 0.0;

        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> mijozlar = new HashMap<>();

        Consumer<Map<String, Double>> chekChiqarish = (maxsulotlarMijoz) -> {
            double mijozSumma = 0;

            if (maxsulotlarMijoz.isEmpty()) {
                return;
            }

            System.out.println("\nChek:");
            for (Map.Entry<String, Double> entry : maxsulotlarMijoz.entrySet()) {
                String maxsulot = entry.getKey();
                Double miqdor = entry.getValue();
                double maxsulotNarxi = maxsulotlar.get(maxsulot);
                double maxsulotSumma = miqdor * maxsulotNarxi;
                mijozSumma += maxsulotSumma;
                System.out.println("" + maxsulot + ": " + miqdor + " kg x " + maxsulotNarxi + " so'm = " + maxsulotSumma + " so'm");
            }

            System.out.println("Jami to'lash: " + mijozSumma + " so'm");
        };

        while (true) {
            System.out.println("\nMijozlar ro'yxati:");
            int i = 1;
            for (String mijoz : mijozlar.keySet()) {
                System.out.println(i + ". " + mijoz);
                i++;
            }

            System.out.println("\n0. Yangi mijoz qo'shish");

            System.out.print("Mijozni tanlang(1,2,...): ");
            int mijozIndex = scanner.nextInt();
            scanner.nextLine();

            if (mijozIndex == 0) {
                System.out.print("Mijozning ismini kiriting: ");
                String ism = scanner.nextLine();
                mijozlar.put(ism, new HashMap<>());
                continue;
            }

            i = 1;
            String mijoz = "";
            for (String ism : mijozlar.keySet()) {
                if (i == mijozIndex) {
                    mijoz = ism;
                    break;
                }
                i++;
            }

            if (mijoz.isEmpty()) {
                System.out.println("Noto'g'ri mijoz raqami. Qaytadan kiriting.");
                continue;
            }

            System.out.println("\nSotib olingan maxsulotlar ro'yxati:");
            Map<String, Double> mijozMaxsulotlar = mijozlar.get(mijoz);
            for (Map.Entry<String, Double> entry : maxsulotlar.entrySet()) {
                String maxsulot = entry.getKey();
                Double narxi = entry.getValue();

                if (mijozMaxsulotlar.containsKey(maxsulot)) {
                    System.out.println(maxsulot + ": " + mijozMaxsulotlar.get(maxsulot) + " kg (narxi: " + narxi + " so'm)");
                }
            }

            System.out.print("Sotib olingan maxsulot nomini kiriting: ");
            String maxsulot = scanner.nextLine();

            if (!maxsulotlar.containsKey(maxsulot)) {
                System.out.println("Bunday maxsulot do'konda mavjud emas. Boshqa maxsulot tanlang.");
                continue;
            }

            System.out.print("Sotib olingan maxsulot miqdorini kiriting (kg): ");
            double miqdor = scanner.nextDouble();
            scanner.nextLine();

            if (miqdor <= 0) {
                System.out.println("Mavjud miqdordan kam miqdorda maxsulot olib bo'lmaydi. Qaytadan kiriting.");
                continue;
            }

            double maxsulotNarxi = maxsulotlar.get(maxsulot);
            double kirimSumma = miqdor * maxsulotNarxi;
            kassa += kirimSumma;

            if (mijozMaxsulotlar.containsKey(maxsulot)) {
                mijozMaxsulotlar.put(maxsulot, mijozMaxsulotlar.get(maxsulot) + miqdor);
            } else {
                mijozMaxsulotlar.put(maxsulot, miqdor);
            }

            System.out.println(miqdor + " kg " + maxsulot + " sotib olindi. Jami summa: " + kirimSumma + " so'm");
            System.out.println("Jami kassa hisobi: " + kassa + " so'm");

            chekChiqarish.accept(mijozMaxsulotlar);
        }
    }
}