package Birinchi_Oy.Matritsa;

public class Matritsa140 {
    public static void main(String[] args) {
        int[][] array1 = {
                {57, 17, 54},
                {86, 4, 52},
        };

        int[][] array2 = {
                {93, 87, 74, 26, 15, 72},
                {37, 67, 96, 6, 96, 94},
                {24, 79, 63, 38, 21, 63}
        };

        int[][] result = new int[array1.length][array2[0].length];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array2.length; k++) {
                    result[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

