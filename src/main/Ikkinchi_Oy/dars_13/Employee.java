package Ikkinchi_Oy.dars_13;

public class Employee {
    int id;
    String name;
    int age;
    double salary;
    Employee(){

    }
    Employee(int id, String name, int age, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    Employee(String name){
        this.name = name;
    }
}
