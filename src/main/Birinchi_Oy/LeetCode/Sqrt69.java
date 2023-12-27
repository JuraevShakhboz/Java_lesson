package Birinchi_Oy.LeetCode;

public class Sqrt69 {
    public static int findSqrt(int target){
        for (int i = 1; i < target; i++) {
            if(i*i == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num = 1024;

        System.out.println(findSqrt(num));
    }
}
