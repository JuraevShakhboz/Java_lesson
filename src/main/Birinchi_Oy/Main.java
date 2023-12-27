package Birinchi_Oy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += arr[j];
            }
            temp[i] = sum;
        }

        System.out.println(Arrays.toString(temp));
    }
}