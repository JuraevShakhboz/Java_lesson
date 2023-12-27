package Birinchi_Oy.LeetCode;

public class RichestCustomerWealth1672 {
    public static int maximumWealth(int[][] arr){
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if(max < sum){
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};

        System.out.println(maximumWealth(accounts));
    }
}
