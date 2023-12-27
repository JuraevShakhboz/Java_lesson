package Ikkinchi_Oy.dars_36;

import java.util.Scanner;

public class FormThreadExample {
    private static String name;
    private static String surname;
    private static int age;
    private static String address;
    private static String phoneNumber;
    private static String email;

    public static void main(String[] args) {
        Thread askQuestionsThread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ismingiz: ");
            name = scanner.nextLine();

            System.out.print("Familiyangiz: ");
            surname = scanner.nextLine();

            System.out.print("Yoshingiz: ");
            age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Manzilingiz: ");
            address = scanner.nextLine();

            boolean valid = false;
            while (!valid) {
                System.out.print("Telefon raqamingiz: ");
                phoneNumber = scanner.nextLine();
                valid = validatePhoneNumber(phoneNumber);
                if (!valid) {
                    System.out.println("Noto'g'ri format! Qaytadan kiriting.");
                }
            }

            valid = false;
            while (!valid) {
                System.out.print("Emailingiz: ");
                email = scanner.nextLine();
                valid = validateEmail(email);
                if (!valid) {
                    System.out.println("Noto'g'ri format! Qaytadan kiriting.");
                }
            }
        });

        Thread gatherAnswersThread = new Thread(() -> {
            try {
                askQuestionsThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        askQuestionsThread.start();
        gatherAnswersThread.start();

        try {
            gatherAnswersThread.join();
            System.out.println("\nUmumiy ma'lumotlar: ");
            System.out.println("Ism: " + name);
            System.out.println("Familiya: " + surname);
            System.out.println("Yosh: " + age);
            System.out.println("Manzil: " + address);
            System.out.println("Telefon raqami: " + phoneNumber);
            System.out.println("Email: " + email);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\+998\\d{9}");
    }

    private static boolean validateEmail(String email) {
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }
}
