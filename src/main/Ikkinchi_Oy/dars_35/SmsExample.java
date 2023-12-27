package Ikkinchi_Oy.dars_35;
class Sms {
    int smsPaket = 500;
}
class SmsService {
    Sms sms = new Sms();

    boolean isready = false;

    public void smsWrite(){
        synchronized (sms){
            while (sms.smsPaket>0){
                if(isready){
                    try {
                        sms.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                sms.smsPaket--;
                System.out.println(Thread.currentThread().getName()+" yangi sms yozildi send");
                isready = true;
                sms.notify();
            }
        }
    }

    public void smsRead(){
        synchronized (sms){
            while (sms.smsPaket>0){
                if(!isready){
                    try {
                        sms.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                sms.smsPaket--;
                System.out.println(Thread.currentThread().getName()+" yangi sms yozildi send");
                isready = false;
                sms.notify();
            }
        }
    }
}
public class SmsExample {
    public static void main(String[] args) {
        SmsService smsService = new SmsService();

        Thread t1 = new Thread(()->{

        });
    }
}
