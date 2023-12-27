package Birinchi_Oy.Matritsa;

public class Matritsa137 {
    public static void main(String[] args) {
        int[][] array = {
                {52, 70, -14, 28},
                {88, -15, 19, -65},
                {76, 53, -60, 27},
                {45, -95, 70, -98}
        };

        int m = 3, n = 0;
        Double urtacha = 0D;

        for (int[] ints : array) {
            for (int anInt : ints) {
                if(Math.abs(anInt) % m == 0){
                    urtacha = urtacha + anInt;
                    n++;
                }
            }
        }
        System.out.printf("\nNatija: %.2f\n", urtacha/n);
    }
}
