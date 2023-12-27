package Ikkinchi_Oy.dars_38;

import java.util.concurrent.atomic.AtomicInteger;

class WebSayt {
    private AtomicInteger numberOfUsers = new AtomicInteger(1000);
    public void login(){
        numberOfUsers.incrementAndGet();
    }
    public void logout(){
        numberOfUsers.decrementAndGet();
    }
    public AtomicInteger getNumberOfUsers(){
        return numberOfUsers;
    }
}

public class Vazifa1 {
    public static void main(String[] args) throws InterruptedException {
        WebSayt obj = new WebSayt();

        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                obj.login();
            }).start();
            new Thread(()->{
                obj.logout();
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(obj.getNumberOfUsers().get());
    }
}
