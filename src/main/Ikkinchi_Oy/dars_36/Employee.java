package Ikkinchi_Oy.dars_36;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String ism;
    private String bolim;
    private double oylik;

    public Employee(String ism, String bolim, double oylik) {
        this.ism = ism;
        this.bolim = bolim;
        this.oylik = oylik;
    }

    public String getBolim() {
        return bolim;
    }

    public double getOylik() {
        return oylik;
    }

    public void setOylik(double oylik) {
        this.oylik = oylik;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Xasan", "ITBolim", 600));
        employees.add(new Employee("Xusan", "SotuvBolim", 1000));
        employees.add(new Employee("Zuhra", "HRBolim", 700));
        employees.add(new Employee("Fotima", "ITBolim", 800));
        employees.add(new Employee("Akmal", "ITBolim", 400));


        employees.stream()
                .filter(employee -> employee.getBolim().equals("ITBolim"))
                .forEach(employee -> {
                    double increasedSalary = employee.getOylik() * 1.10;
                    employee.setOylik(increasedSalary);
                });


        double averageSalaryIT = employees.stream()
                .filter(employee -> employee.getBolim().equals("ITBolim"))
                .mapToDouble(Employee::getOylik)
                .average()
                .orElse(0);


        System.out.printf("IT bo'limidagi xodimlar o'rtacha oyligi: $%.2f", averageSalaryIT);
    }
}
