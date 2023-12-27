package Ikkinchi_Oy.dars_28;

public class Student {
    private String name;
    private Integer tjSoni;
    private Integer savollarSoni;
    private Float foiz;



    public Student(String name, Integer tjSoni, Integer savollarSoni) {
        this.name = name;
        this.tjSoni = tjSoni;
        this.savollarSoni = savollarSoni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTjSoni() {
        return tjSoni;
    }

    public void setTjSoni(Integer tjSoni) {
        this.tjSoni = tjSoni;
    }

    public Integer getSavollarSoni() {
        return savollarSoni;
    }

    public void setSavollarSoni(Integer savollarSoni) {
        this.savollarSoni = savollarSoni;
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
                ", tjSoni=" + tjSoni +
                ", savollarSoni=" + savollarSoni +
                '}';
    }
}
