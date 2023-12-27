package Birinchi_Oy.Matritsa;

import java.util.Scanner;

public class Matritsa135 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1, a = sc.nextInt(), b = sc.nextInt();
        int[][] array = new int[a][b];
        int[][] result = new int[a-1][b];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            n++;
            if(i == k - 1){
                n--;
                continue;
            }
            for (int j = 0; j < array[0].length; j++) {
                result[n][j] = array[i][j];
            }
        }
        System.out.println("\nNatija:");
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
