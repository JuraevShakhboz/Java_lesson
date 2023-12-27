package Birinchi_Oy.LeetCode;

import java.util.Arrays;

public class SortthePeople2418 {
    public static void main(String[] args) {
        String[] names = new String[]{"Mary","John","Emma"};
        int[] heigth = new int[]{180,165,170};
        String temp = "";
        int n = heigth.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if(heigth[j-1] < heigth[j]){
                    temp = names[j-1];
                    names[j-1] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }
}
