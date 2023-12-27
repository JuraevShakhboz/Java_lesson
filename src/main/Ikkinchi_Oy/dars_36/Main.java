package Ikkinchi_Oy.dars_36;

import java.util.Scanner;

public class Main {
    private static boolean validateEmail(String email) {
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }
    private static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\+998\\d{9}");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = "";
        String phoneNumber = "";
        boolean valid = false;

        while (!valid) {
            System.out.print("Email kiriting: ");
            email = sc.nextLine();
            valid = validateEmail(email);
            if (!valid) {
                System.out.println("Noto'g'ri format! Qaytadan kiriting.");
            }
        }
        valid = false;
        while (!valid) {
            System.out.print("Telefon raqam kiriting: ");
            phoneNumber = sc.nextLine();
            valid = validatePhoneNumber(phoneNumber);
            if (!valid) {
                System.out.println("Noto'g'ri format! Qaytadan kiriting.");
            }
        }

        System.out.println("\nEmail to'g'ri kiritildi: "+email);
        System.out.println("Number to'g'ri kiritildi: "+phoneNumber);
    }
}

