package Birinchi_Oy;

import java.util.Arrays;

public class RangeSort {
    public static void countingSort(int[] input, int min, int max){
        int[] countArray = new int[(max-min) + 1];
        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while(countArray[i-min]>0){
                input[j++] = i;
                countArray[i-min]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] input = {172,135,179,188,200,168,157,130,144,163};
        countingSort(input, 100, 200);
        System.out.println(Arrays.toString(input));
    }
}
