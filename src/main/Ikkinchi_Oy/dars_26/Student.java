package Ikkinchi_Oy.dars_26;

class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String tel;

    public Student(String firstName, String lastName, int age, String email, String tel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.tel = tel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}