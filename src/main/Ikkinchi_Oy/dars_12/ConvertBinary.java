package Ikkinchi_Oy.dars_12;

import java.util.Scanner;

public class ConvertBinary {
    public static int conBin(int n){
        String binary = Integer.toBinaryString(n);
        int count = 0, maxCount = 0;

        for (char el: binary.toCharArray()) {
            if(el == '0'){
                count++;
            }
            else{
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
        }
        System.out.println(binary);
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(conBin(n));
    }
}
