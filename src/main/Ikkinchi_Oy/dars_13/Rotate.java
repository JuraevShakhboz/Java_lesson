package Ikkinchi_Oy.dars_13;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int arr[] = new int[] {3,8,9,7,6};
        int n = arr.length;
        int k = 3;
        k = k % n;
        int i, j;

        for (i = n - k, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (i = 0, j = n - k - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
