package Ikkinchi_Oy.dars_18;

import java.util.Scanner;

public class Masala132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr1 = new int[l];

        for (int i = 0; i < l; i++) {
            arr1[i] = sc.nextInt();
        }

        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr2 = new int[n][m];
            int s = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr2[0].length; k++) {
                    if(s < l){
                        arr2[j][k] = arr1[s];
                        s++;
                    }
                    else {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
