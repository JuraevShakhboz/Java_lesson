package Birinchi_Oy.Matritsa;

public class Matritsa139 {
    public static void main(String[] args) {
        int[][] array = {
                {42, 52, 28, 64},
                {22, -14, 4, 80},
                {23, 19, 97, 35},
                {3, 37, 36, 90}
        };
        int a = 0, b = 0;
        int[][] result = new int[array.length-1][array[0].length-1];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j] < 0){
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        int x = -1;
        for (int i = 0; i < array.length; i++) {
            x++;
            if(i == a){
                x--;
                continue;
            }
            int y = -1;
            for (int j = 0; j < array[0].length; j++) {
                y++;
                if(j == b){
                    y--;
                    continue;
                }
                else{
                    result[x][y] = array[i][j];
                }
            }
        }

        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}
