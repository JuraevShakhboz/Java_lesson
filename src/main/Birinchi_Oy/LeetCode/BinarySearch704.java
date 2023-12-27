package Birinchi_Oy.LeetCode;

public class BinarySearch704 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int findNumber = 3;

        BinarySearch704 binary = new BinarySearch704();

        System.out.println("Find number index: " + binary.search(arr, findNumber));
    }
    public int search(int[] nums, int target) {
        int bosh = 0, oxir = nums.length - 1;
        while (bosh <= oxir) {
            int urta = (oxir - bosh) / 2 + bosh;
            int num = nums[urta];
            if (num == target)
                return urta;
            else if (num > target)
                oxir = urta - 1;
            else
                bosh = urta + 1;
        }
        return -1;
    }
}
