package Birinchi_Oy.LeetCode;

import java.util.Arrays;

public class SortArrayByParity905 {
    public int[] sortArrayByParity(int[] nums) {
        for (int i = 0, j = nums.length - 1; i < j;) {
            if (nums[i] % 2 == 1) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                --j;
            } else {
                ++i;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};

        SortArrayByParity905 ob = new SortArrayByParity905();

        System.out.println(Arrays.toString(ob.sortArrayByParity(nums)));
    }
}
