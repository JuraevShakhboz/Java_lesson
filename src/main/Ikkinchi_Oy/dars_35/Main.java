package Ikkinchi_Oy.dars_35;

class Qoshiq {
    Integer qoshiq;
    boolean navbat = false;

    public synchronized void navbatBir(){
        for (int i = 1; i <= 10; i++) {
            while(!navbat){
                try {
                    wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            qoshiq = qoshiq+i;
            System.out.println(Thread.currentThread().getName());
            navbat = false;
            notify();
        }
    }

    public synchronized void navbatIkki(){
        for (int i = 1; i <= 10; i++) {
            while(navbat){
                try {
                    wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            qoshiq = qoshiq+i;
            System.out.println(Thread.currentThread().getName());
            navbat = true;
            notify();
        }
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
       Qoshiq obj = new Qoshiq();

       Thread t1 = new Thread(()->{
           obj.navbatBir();
       });

       Thread t2 = new Thread(()->{
           obj.navbatIkki();
       });

       t1.start();
       t2.start();

       t1.join();
       t2.join();
    }
}
