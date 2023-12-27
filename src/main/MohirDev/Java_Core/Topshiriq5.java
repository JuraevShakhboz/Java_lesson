package MohirDev.Java_Core;

import java.util.Arrays;

public class Topshiriq5 {
    public static void main(String[] args) {
        int[] array = {100, 50, 75, 200, 150};

        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length-1];

        System.out.printf("(%d, %d)", min, max);

    }
}
