package Ikkinchi_Oy.dars_25;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal a = new Animal() {
            @Override
            public void live() {
                System.out.println("Salom Anonym Class");;
            }
        };
        a.live();
    }
}
