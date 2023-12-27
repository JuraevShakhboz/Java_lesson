package Ikkinchi_Oy.dars_26;

public class Employee {
    private String name;
    private Integer YilTajribasi;
    private Integer OylikMaoshi;
    private Integer QobilyatlariSoni;

    public Employee(String name, Integer yilTajribasi, Integer oylikMaoshi, Integer qobilyatlariSoni) {
        this.name = name;
        YilTajribasi = yilTajribasi;
        OylikMaoshi = oylikMaoshi;
        QobilyatlariSoni = qobilyatlariSoni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYilTajribasi() {
        return YilTajribasi;
    }

    public void setYilTajribasi(Integer yilTajribasi) {
        YilTajribasi = yilTajribasi;
    }

    public Integer getOylikMaoshi() {
        return OylikMaoshi;
    }

    public void setOylikMaoshi(Integer oylikMaoshi) {
        OylikMaoshi = oylikMaoshi;
    }

    public Integer getQobilyatlariSoni() {
        return QobilyatlariSoni;
    }

    public void setQobilyatlariSoni(Integer qobilyatlariSoni) {
        QobilyatlariSoni = qobilyatlariSoni;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", YilTajribasi=" + YilTajribasi +
                ", OylikMaoshi=" + OylikMaoshi +
                ", QobilyatlariSoni=" + QobilyatlariSoni +
                '}';
    }
}
