package Ikkinchi_Oy.dars_36;

class Person{
    int suv = 100;
    PersonStatus personStatus = PersonStatus.BOLA;

    public synchronized void bola(){
        while (suv>0){
            while (personStatus!=PersonStatus.BOLA){
                try {
                    wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if(suv>0){
                suv = suv-10;
                System.out.println(Thread.currentThread().getName()+" suv ichmoqda. "+suv);
                personStatus = PersonStatus.ONA;
                notifyAll();
            }
        }
    }

    public synchronized void ona(){
        while (suv>0){
            while (personStatus!=PersonStatus.ONA){
                try {
                    wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if(suv>0) {
                suv = suv - 10;
                System.out.println(Thread.currentThread().getName() + " suv ichmoqda. " + suv);
                personStatus = PersonStatus.OTA;
                notifyAll();
            }
        }
    }

    public synchronized void ota(){
        while (suv>0){
            while (personStatus!=PersonStatus.OTA){
                try {
                    wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if(suv>0) {
                suv = suv - 10;
                System.out.println(Thread.currentThread().getName() + " suv ichmoqda. " + suv);
                personStatus = PersonStatus.BOLA;
                notifyAll();
            }
        }
    }
}