package homeWork.HW13;

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
        employees.add(new Employee("Дорофеева Ирина Александровна",7777, 35));
        employees.add(new Employee("Громов Сергей Сергеевич", 6055, 35));
        Iterator<Employee> employeeIterator = employees.iterator();

        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            printEmployeeIfWorkAgeEquals(employee, 35 );
        }
        System.out.println("*******************");
    }

    private static void printEmployeeIfWorkAgeEquals(Employee employee, int workAge) {

        if (employee.workAge == workAge) {
            System.out.println("ФИО "  +employee.getName()  +" Табельный № "  +employee.getPersonnelNumber()  +" Стаж работы "  +employee.getWorkAge()  +" лет");
        }
    }

}