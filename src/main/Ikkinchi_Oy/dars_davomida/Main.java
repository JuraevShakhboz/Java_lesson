package Ikkinchi_Oy.dars_davomida;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Anvar", 65f),
                new Student("Sanjar", 75f),
                new Student("Ali", 27f),
                new Student("Sobir", 60f)
        );

        Consumer<Student> consumer = (x) ->{
            if (x.getFoiz()>=60){
                System.out.println(x.getName() + " o'tdi");
            }
            else{
                System.out.println(x.getName() + " yiqildi");
            }
        };

        students.stream()
                .forEach(consumer);
    }
}
