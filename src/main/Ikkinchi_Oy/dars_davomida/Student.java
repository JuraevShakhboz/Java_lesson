package Ikkinchi_Oy.dars_davomida;

public class Student {
    private String name;
    private Float foiz;

    public Student(String name, Float foiz) {
        this.name = name;
        this.foiz = foiz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Float getFoiz() {
        return foiz;
    }

    public void setFoiz(Float foiz) {
        this.foiz = foiz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", foiz=" + foiz +
                '}';
    }
}
