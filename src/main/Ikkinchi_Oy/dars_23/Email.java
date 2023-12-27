package Ikkinchi_Oy.dars_23;

import java.util.*;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ema;
        LinkedHashSet<String> email = new LinkedHashSet<>();
        String exit;
        boolean finish = false;

        while (!finish){
            System.out.print("Email kiriting: ");
            finish = email.add(sc.next() + sc.nextLine());
            if(finish == true){
                System.out.println("Email muvaffaqiyatli qo'shildi !");
                finish = false;
            }
            else {
                System.out.println("Email band !!!");
                continue;
            }

        }
    }
}
