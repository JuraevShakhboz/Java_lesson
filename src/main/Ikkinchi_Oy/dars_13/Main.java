package Ikkinchi_Oy.dars_13;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Shahboz", 27, 15.5);

        System.out.println("ID: "+e.id);
        System.out.println("NAME: "+e.name);
        System.out.println("AGE: "+e.age);
        System.out.println("SALARY: "+e.salary);
    }
}
