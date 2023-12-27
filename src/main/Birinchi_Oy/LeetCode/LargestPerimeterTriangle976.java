package Birinchi_Oy.LeetCode;

import java.util.Arrays;

public class LargestPerimeterTriangle976 {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; --i) {
            int c = nums[i - 1] + nums[i - 2];
            if (c > nums[i]) {
                return c + nums[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,2};
        LargestPerimeterTriangle976 ob = new LargestPerimeterTriangle976();
        System.out.println(ob.largestPerimeter(nums));
    }
}
