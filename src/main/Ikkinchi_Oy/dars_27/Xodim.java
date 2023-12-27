package Ikkinchi_Oy.dars_27;

public class Xodim {

    private String name;
    private Double salary;
    private String bolim;

    public Xodim(String name, Double salary, String bolim) {
        this.name = name;
        this.salary = salary;
        this.bolim = bolim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getBolim() {
        return bolim;
    }

    public void setBolim(String bolim) {
        this.bolim = bolim;
    }

    @Override
    public String toString() {
        return "Xodim{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", bolim='" + bolim + '\'' +
                '}';
    }
}
