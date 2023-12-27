package Birinchi_Oy.LeetCode;

public class MatrixDiagonalSum1572 {
    public static int diagonalSum(int[][] arr){

        int n = arr.length;
        int mid = n / 2;
        int summation = 0;
        for( int i = 0 ; i < n ; i++ ){
            summation += arr[i][i];
            summation += arr[n-1-i][i];
        }
        if( n % 2 == 1 ){
            summation -= arr[mid][mid];
        }

        return summation;
    }

    public static void main(String[] args) {
        int[][] mat = {
                    {1,1,1},
                    {2,2,2},
                    {3,3,3}

        };

        System.out.println(diagonalSum(mat));
    }
}
