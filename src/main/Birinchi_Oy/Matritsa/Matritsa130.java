package Birinchi_Oy.Matritsa;

public class Matritsa130 {
    public static void main(String[] args) {

        int[][] arr = {
                {-37, 24, -42},
                {10, -57, 52},
                {-12, 94, -94},
                {5, -42, 27}

        };
        int[] victor = new int[arr.length];
        int max = arr[0][0], min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
            victor[i] = sum;
        }

        for (int i : victor) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + max + " " + min);
    }
}
