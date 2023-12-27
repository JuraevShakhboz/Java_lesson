package MohirDev.Java_Core;

import java.util.Arrays;

public class Topshiriq3 {
    public static void main(String[] args) {
        int[] array = {100, 150, 175, 200, 250};

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        System.out.println(Arrays.equals(array, sortedArray));
    }
}
