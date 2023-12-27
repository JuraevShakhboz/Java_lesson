package Ikkinchi_Oy.dars_13;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Rotation {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r)
            swap(nums, l++, r--);
    }

    private void swap(int[] nums, int l, int r) {
        final int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {0,0,0};
        int k = sc.nextInt();

        Array_Rotation s = new Array_Rotation();
        s.rotate(a, k);
        System.out.println(Arrays.toString(a));
    }
}
