package Birinchi_Oy.Matritsa;

public class Matritsa138 {
    public static void main(String[] args) {
        int[][] array = {
                {86,  92, -20,  14,  87, -92,  7,   25, -52},
                {52, -40,  38, -95,  77, -91,  64, -55,  18},
                {26,  20,  -9,  82,  30, -37,  86,  91, -56},
                {82, -36,  56, -56,  18, -74,  60, -53,  46},
                {38,  34, -34,  48,  51, -77,  83,  22,   0},
                {26, -85,  85,  -3,  17, -84,  81, -70,  36},
                {19,   9,  -8,  80,   0, -78,  40,  85, -13},
                {98, -16,  25, -59,  99, -54,  45, -53,  40},
                {32,  39, -65,  27,  37,  -9,  91,   8, -36}
        };

        int a_katta = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(i == j){
                    if(a_katta < array[i][j]){
                        a_katta = array[i][j];
                    }
                }
            }
        }
        int n = array.length-1;
        int t_kichik = array[n][0];
        for (int i = 0; i < array.length; i++) {
            if(t_kichik > array[i][n-i]){
                t_kichik = array[i][n-i];
            }
        }
        System.out.println(a_katta + " " + t_kichik);
    }
}
