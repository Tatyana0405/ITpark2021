package Homework.HW13;

import java.util.*;

public class EmployeeRunner {
    public static void main(String[] args) {

        Set<Employee> employees = new LinkedHashSet<>();
        employees.add(new Employee("Атонова Антонина Ивановна", 1253, 35));
        employees.add(new Employee("Петров Игорь Иванович", 2356, 10));
        employees.add(new Employee("Кузичева Ольга Николаевна", 4444, 5));
        employees.add(new Employee("Семенова Зинаида Петровна", 6767, 7));
        employees.add(new Employee("Иванов Антон Александрович", 1111, 10));
        employees.add(new Employee("Федоров Максим Ильич", 6988, 11));
        employees.add(new Employee("Суворов Петр Павлович", 1333, 35));
        employees.add(new Employee("Туманова Марина Николаевна", 5959, 25));
        employees.add(new Employee("Дорофеева Ирина Александровна", 7777, 35));
        employees.add(new Employee("Громов Сергей Сергеевич", 6055, 35));
        Iterator<Employee> employeeIterator = employees.iterator();
        Iterator<Employee> itr = employees.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            ageSorter(employee);
        }
        System.out.println("*******************");
        try {
            while (itr.hasNext()) {
                for (int i = employees.size() - 1; i < employees.size(); i+=2) {
                    Employee employee = employeeIterator.next();
                        employeeIterator.remove();
                    }
                }
        } catch (NoSuchElementException e) {
            System.out.println("Что-то пошло не так!");
        }
    }

    private static void ageSorter(Employee employee) {
        if (employee.workAge == 35) {
            System.out.println("ФИО " + employee.getName() + " Табельный № " + employee.getPersonnelNumber() + " Стаж работы " + employee.getWorkAge() + " лет");
        }
    }
}