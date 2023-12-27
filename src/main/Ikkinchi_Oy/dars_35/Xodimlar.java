package Ikkinchi_Oy.dars_35;

public class Xodimlar {
    private String ismi;
    private Integer oyligi;

    public Xodimlar(String ismi, Integer oyligi) {
        this.ismi = ismi;
        this.oyligi = oyligi;
    }

    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public Integer getOyligi() {
        return oyligi;
    }

    public void setOyligi(Integer oyligi) {
        this.oyligi = oyligi;
    }

    @Override
    public String toString() {
        return "Xodimlar{" +
                "ismi='" + ismi + '\'' +
                ", oyligi=" + oyligi +
                '}';
    }
}
