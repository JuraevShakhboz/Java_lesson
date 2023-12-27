package MohirDev.Java_Core;

public class Topshiriq7 {
    public static void main(String[] args) {

        String password = "Password1@";

        boolean Katta = false;
        boolean Kichik = false;
        boolean Raqam = false;
        boolean Belgi = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                Katta = true;
            } if (Character.isLowerCase(ch)) {
                Kichik = true;
            } if (Character.isDigit(ch)) {
                Raqam = true;
            } if (Character.isDefined(ch)) {
                Belgi = true;
            }
        }

        boolean result = Katta && Kichik && Raqam && Belgi;

        if(result == true){
            System.out.println("Natija: " + result);
        } else {
            System.out.println("Natija: " + result);
        }
    }
}
