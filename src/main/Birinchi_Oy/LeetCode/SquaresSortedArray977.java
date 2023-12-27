package Birinchi_Oy.LeetCode;

import java.util.Arrays;

public class SquaresSortedArray977 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0, j = n - 1, k = n - 1; i <= j;) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                res[k--] = nums[i] * nums[i];
                ++i;
            } else {
                res[k--] = nums[j] * nums[j];
                --j;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};

        SquaresSortedArray977 ob = new SquaresSortedArray977();

        System.out.println(Arrays.toString(ob.sortedSquares(arr)));
    }
}
