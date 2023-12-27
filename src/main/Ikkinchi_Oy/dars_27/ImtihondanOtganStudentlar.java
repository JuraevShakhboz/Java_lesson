package Ikkinchi_Oy.dars_27;

public class ImtihondanOtganStudentlar {
    private String ismi;
    private Integer yoshi;
    private Double toplaganBali;
    private Double tolovSummasi;

    public ImtihondanOtganStudentlar(String ismi, Integer yoshi, Double toplaganBali, Double tolovSummasi) {
        this.ismi = ismi;
        this.yoshi = yoshi;
        this.toplaganBali = toplaganBali;
        this.tolovSummasi = tolovSummasi;
    }

    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public Integer getYoshi() {
        return yoshi;
    }

    public void setYoshi(Integer yoshi) {
        this.yoshi = yoshi;
    }

    public Double getToplaganBali() {
        return toplaganBali;
    }

    public void setToplaganBali(Double toplaganBali) {
        this.toplaganBali = toplaganBali;
    }

    public Double getTolovSummasi() {
        return tolovSummasi;
    }

    public void setTolovSummasi(Double tolovSummasi) {
        this.tolovSummasi = tolovSummasi;
    }

    @Override
    public String toString() {
        return "ImtihondanOtganStudentlar{" +
                "ismi='" + ismi + '\'' +
                ", yoshi=" + yoshi +
                ", toplaganBali=" + toplaganBali +
                ", tolovSummasi=" + tolovSummasi +
                '}';
    }
}
