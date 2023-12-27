package Ikkinchi_Oy.dars_32;

public class Main {
    public static long FactorialCalculator(int a){
        long x = 1;
        for (int i = 1; i <= a; i++) {
            x *= i;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        Thread thread1 = new Thread(()->{
            System.out.println(arr[0] + " ning faktoriali: " + FactorialCalculator(arr[0]));
        });
        Thread thread2 = new Thread(()->{
            System.out.println(arr[1] + " ning faktoriali: " + FactorialCalculator(arr[1]));
        });
        Thread thread3 = new Thread(()->{
            System.out.println(arr[2] + " ning faktoriali: " + FactorialCalculator(arr[2]));
        });
        Thread thread4 = new Thread(()->{
            System.out.println(arr[3] + " ning faktoriali: " + FactorialCalculator(arr[3]));
        });
        Thread thread5 = new Thread(()->{
            System.out.println(arr[4] + " ning faktoriali: " + FactorialCalculator(arr[4]));
        });
        Thread thread6 = new Thread(()->{
            System.out.println(arr[5] + " ning faktoriali: " + FactorialCalculator(arr[5]));
        });
        Thread thread7 = new Thread(()->{
            System.out.println(arr[6] + " ning faktoriali: " + FactorialCalculator(arr[6]));
        });
        Thread thread8 = new Thread(()->{
            System.out.println(arr[7] + " ning faktoriali: " + FactorialCalculator(arr[7]));
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();

    }
}
