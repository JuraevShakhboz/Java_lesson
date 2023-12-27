package Birinchi_Oy.Matritsa;

public class Matritsa141 {
    public static void main(String[] args) {

        int[][] matrix = {
                {42, -15, 86, -67, 70},
                {24, 86, 1, 56, 50},
                {36, -82, 86, -64, 26},
                {55, 11, 11, 67, 84}
        };

        int x = 48;
        int y = 84;

        int sum = 0;
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] >= x && matrix[i][j] <= y){
                    sum += matrix[i][j];
                    count++;
                }
            }
        }
        double result = (double) sum / count;
        System.out.printf("O'rtacha qiymati: %.2f\n", result);
    }
}