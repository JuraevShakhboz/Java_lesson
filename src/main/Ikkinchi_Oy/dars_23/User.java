package Ikkinchi_Oy.dars_23;

public class User {
    Integer id;
    String name;
    String surname;
    String tel;

    public User(Integer id, String name, String surname, String tel) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.tel = tel;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
