package Ikkinchi_Oy.dars_28;

public class Maxsulot {
    private String nomi;
    private String turi;
    private Integer miqdori;
    private OlchovBirlik olchovBirlik;

    private Double narxiDona;

    public Maxsulot(String nomi, String turi, Integer miqdori, OlchovBirlik olchovBirlik, Double narxiDona) {
        this.nomi = nomi;
        this.turi = turi;
        this.miqdori = miqdori;
        this.olchovBirlik = olchovBirlik;
        this.narxiDona = narxiDona;
    }

    public String getNomi() {
        return nomi;
    }

    public void setNomi(String nomi) {
        this.nomi = nomi;
    }

    public String getTuri() {
        return turi;
    }

    public void setTuri(String turi) {
        this.turi = turi;
    }

    public Integer getMiqdori() {
        return miqdori;
    }

    public void setMiqdori(Integer miqdori) {
        this.miqdori = miqdori;
    }

    public OlchovBirlik getOlchovBirlik() {
        return olchovBirlik;
    }

    public void setOlchovBirlik(OlchovBirlik olchovBirlik) {
        this.olchovBirlik = olchovBirlik;
    }

    public Double getNarxiDona() {
        return narxiDona;
    }

    public void setNarxiDona(Double narxiDona) {
        this.narxiDona = narxiDona;
    }

    @Override
    public String toString() {
        return "Maxsulot{" +
                "nomi='" + nomi + '\'' +
                ", turi='" + turi + '\'' +
                ", miqdori=" + miqdori +
                ", olchovBirlik=" + olchovBirlik +
                ", narxiDona=" + narxiDona +
                '}';
    }
}
