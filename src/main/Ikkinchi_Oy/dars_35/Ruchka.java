package Ikkinchi_Oy.dars_35;

class A {
    int ruchka = 100;

}
class RuchkaService {
    A obj = new A();
    boolean qiymat = false;

    public void writeOne(){
        synchronized (obj){
            while (obj.ruchka > 0){
                if(qiymat){
                    try {
                        obj.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                obj.ruchka-=10;
                System.out.println(Thread.currentThread().getName() +  " birinchi ishtirokchi yozdi");
                qiymat = true;
                obj.notify();
            }
        }
    }

    public void writeTwo(){
        synchronized (obj){
            while (obj.ruchka > 0){
                if(!qiymat){
                    try {
                        obj.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                obj.ruchka-=10;
                System.out.println(Thread.currentThread().getName() +  " ikkinchi ishtirokchi yozdi");
                qiymat = false;
                obj.notify();
            }
        }
    }
}

public class Ruchka {
    public static void main(String[] args) throws InterruptedException {
        RuchkaService ruchkaService = new RuchkaService();

        Thread t1 = new Thread(()->{
            ruchkaService.writeOne();
        });

        Thread t2 = new Thread(()->{
            ruchkaService.writeTwo();
        });

        t1.start();
        t2.start();
    }
}
