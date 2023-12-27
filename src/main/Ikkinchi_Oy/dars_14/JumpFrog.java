package Ikkinchi_Oy.dars_14;

public class JumpFrog {
    public static  int Jump(int X, int Y, int K){
        int count = 0;

        while(X <= Y){
            X += K;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int X = -150;
        int Y = 150;
        int K = 10;

        System.out.println(Jump(X, Y, K));
    }
}
