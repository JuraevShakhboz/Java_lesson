package Ikkinchi_Oy.dars_27;

class ABC{
    int x = 30;
}

public class DeepandShallowCopy {
    public static void main(String[] args) {
        ABC obj1 = new ABC();

        ABC obj2 = new ABC(); //DeepCopy qilindi

        ABC obj3 = obj1; //ShallowCopy qilindi

        obj2.x = 10;

        obj3.x = 25;


        System.out.println(obj1.x);
        System.out.println(obj2.x);
        System.out.println(obj3.x);

    }
}
