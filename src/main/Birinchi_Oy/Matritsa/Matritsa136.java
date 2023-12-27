package Birinchi_Oy.Matritsa;


public class Matritsa136 {
    public static void main(String[] args) {
        int[][] array = {
                {57, 63, -90, 13, 41},
                {88, -74, 11, -40, 69},
                {22, 84, -66, 58, 29},
        };
        int[][] result = new int[array.length][array[0].length-1];
        int k = 3;
        for (int i = 0; i < array.length; i++) {
            int n = -1;
            for (int j = 0; j < array[0].length; j++) {
                n++;
                if(j == k - 1){
                    n--;
                    continue;
                }
                else{
                    result[i][n] = array[i][j];
                }
            }
        }
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
