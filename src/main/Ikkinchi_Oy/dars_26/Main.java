package Ikkinchi_Oy.dars_26;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Kamol", 10, 5000000, 3));
        employees.add(new Employee("Farrux", 8, 3500000, 4));
        employees.add(new Employee("Anvar", 15, 8000000, 5));



        EmployeeComparator comparator = (employee1, employee2) ->
                employee1.getYilTajribasi() > employee2.getYilTajribasi() &&
                        employee1.getOylikMaoshi() > employee2.getOylikMaoshi() &&
                        employee1.getQobilyatlariSoni() > employee2.getQobilyatlariSoni();

        Employee bestEmployee = findBestEmployee(employees, comparator);

        System.out.println("Eng zo'r xodim: " + bestEmployee.getName());


    }

    private static Employee findBestEmployee(List<Employee> employees, EmployeeComparator comparator) {
        Employee bestEmployee = null;

        for (Employee employee : employees) {
            if (bestEmployee == null || comparator.zor(employee, bestEmployee)) {
                bestEmployee = employee;
            }
        }

        return bestEmployee;
    }

}