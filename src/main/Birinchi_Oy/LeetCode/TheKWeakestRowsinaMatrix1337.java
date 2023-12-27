package Birinchi_Oy.LeetCode;

import java.util.Arrays;

public class TheKWeakestRowsinaMatrix1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int y = mat.length, x = mat[0].length, count = 0;
        int[] arr = new int[y], arr1 = new int[k];
        for (int j = 0; j <= x; j++)
            for (int i = 0; i < y; i++) {
                if (arr[i] == 0 && (j == x || mat[i][j] == 0)) {
                    arr1[count++] = i;
                    arr[i]++;
                }
                if (count == k) return arr1;
            }
        return arr1;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1,0,0,0},
                {1,1,1,1},
                {1,0,0,0},
                {1,0,0,0},
        };
        System.out.println(Arrays.toString(new TheKWeakestRowsinaMatrix1337().kWeakestRows(mat, 2)));
    }
}
