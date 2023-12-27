package Ikkinchi_Oy.dars_19;

public class TeskariMatn {
    public static void main(String[] args) {
        String txt = "Hello World";
        String natija = "";
        String[] arr = txt.split(" ");

        for (String s : arr) {
            char[] arr1 = s.toCharArray();
            for (int i = arr1.length-1; i >= 0; i--) {
                natija += arr1[i];
            }
            natija += " ";
        }

        System.out.println(natija);
    }
}