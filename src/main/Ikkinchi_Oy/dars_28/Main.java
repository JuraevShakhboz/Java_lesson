package Ikkinchi_Oy.dars_28;


import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Anvar", 25, 30),
                new Student("Bobur", 20, 30),
                new Student("Jasur", 15, 30),
                new Student("Sanjar", 30, 30)
        );

        Consumer<Student> con1 = (x) -> {
            x.setFoiz(((float)x.getTjSoni()/(float)x.getSavollarSoni())*100);
            System.out.println(x);
        };

        students.stream()
                .forEach(con1);
    }
}
