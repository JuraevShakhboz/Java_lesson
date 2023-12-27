package Ikkinchi_Oy.dars_21;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Student> student = new ArrayDeque<>();
        student.addLast(new Student(1, "Shahboz", "Jo'rayev", "jurayevshaxboz96@gmail.com", "998993105718"));
        student.addLast(new Student(2, "Alisher", "Ro'zmurodov", "doston92@gmail.com", "998995352092"));

        for (Student student1 : student) {
            System.out.println(student1);
        }
    }
}