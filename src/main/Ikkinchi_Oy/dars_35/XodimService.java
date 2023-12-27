package Ikkinchi_Oy.dars_35;

import java.util.ArrayList;

public class XodimService {
    private ArrayList<Xodimlar> xodimlar = new ArrayList<>();

    public XodimService(){
        xodimlar.add(new Xodimlar("Alisher", 1000));
        xodimlar.add(new Xodimlar("Jasur", 1000));
        xodimlar.add(new Xodimlar("Nodir", 1000));
        xodimlar.add(new Xodimlar("Sardor", 1000));
    }
    public  void dosomThing(){
        for (Xodimlar xodimlar1 : xodimlar) {
            xodimlar1.setOyligi(xodimlar1.getOyligi()+10);
            System.out.println(xodimlar1 + " called by " + Thread.currentThread().getName());
        }
    }
}
