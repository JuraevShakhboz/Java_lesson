package Uchinchi_Oy.dars_41;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
class Student {
    private Integer id;
    private String name;
    private String fam;
    private Integer yosh;
    private Integer bal;

    public Student(Integer id, String name, String fam, Integer yosh, Integer bal) {
        this.id = id;
        this.name = name;
        this.fam = fam;
        this.yosh = yosh;
        this.bal = bal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public Integer getYosh() {
        return yosh;
    }

    public void setYosh(Integer yosh) {
        this.yosh = yosh;
    }

    public Integer getBal() {
        return bal;
    }

    public void setBal(Integer bal) {
        this.bal = bal;
    }
}
public class WriteFileExample {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ali", "Valiyev", 24, 67));
        students.add(new Student(2, "Vli", "Aaliyev", 20, 70));
        students.add(new Student(3, "Soli", "Oliyev", 22, 80));
        students.add(new Student(4, "Shahboz", "Jo'rayev", 27, 90));
        students.add(new Student(5, "Sardor", "Alimov", 25, 50));

        FileOutputStream io = new FileOutputStream("files/oddiy.txt");

        for (Student s: students) {
            String c = s.getId() + ". "+ s.getName()+", "+s.getFam()+", "+s.getYosh()+", "+s.getBal()+"\n";
            io.write(c.getBytes());
        }

        io.close();
    }
}
