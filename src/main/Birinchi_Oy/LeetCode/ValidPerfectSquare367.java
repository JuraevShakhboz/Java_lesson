package Birinchi_Oy.LeetCode;

public class ValidPerfectSquare367 {
    public static boolean validperfectsquare(int num){
        int left = 0;
        int right = num;

        while (left <= right){
            int mid = left + (right - left) / 2;
            int kv = mid * mid;

            if (kv == num){
                return true;
            }
            if (kv < num){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a = 8;

        System.out.println(validperfectsquare(a));

    }
}
