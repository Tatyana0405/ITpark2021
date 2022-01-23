package Homework.HW20;

import jakarta.xml.bind.JAXB;
import lombok.SneakyThrows;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;


public class EmployeeRunner {

    private static Employee getEmployee(String FIO) {
        int div = 1;
        return new Employee()
                .setEmployeeID(new Random().nextInt(100000) + "")
                .setLogin("#" + div++).setFIO(FIO)
                .setDepartment(departments.get(new Random().nextInt(departments.size())))
                .setPosition(positions.get(new Random().nextInt(positions.size())));
    }

    private static final List<Department> departments = List.of(
            new Department("Прогресс", "Самара"),
            new Department("КУЗНЕЦОВ", "Самара"),
            new Department("Aвиаагрегат", "Самара"));

    private static final List<Position> positions = List.of(
            new Position("ВИК", new BigDecimal(50000)),
            new Position("ИК1", new BigDecimal(40000)),
            new Position("ИК2", new BigDecimal(30000)),
            new Position("ИК3", new BigDecimal(25000)),
            new Position("ИК", new BigDecimal(20000)));

    @SneakyThrows
    public static void main(String[] args) {
        EmployeeType employees = ((EmployeeType) List.of(
                getEmployee("Тимофеева Варвара Николаевна"),
                getEmployee("Помидоров Тимур Альбертович"),
                getEmployee("Осипов Игорь Михайлович"),
                getEmployee("Муркаева маргарита Тимофеевна"),
                getEmployee("Милимонов Лазарь Илларионович"),
                getEmployee("Цукарь Маиза Эдуардовна")));

        Path path = Paths.get("D:\\test\\employee.xml");
        Path parentPath = path.getParent();
        if (!parentPath.toFile().exists()) {
            parentPath.toFile().mkdirs();
        }
        System.out.printf("Запись в файл ", path.getFileName());
        JAXB.marshal(employees, path.toFile());
        System.out.println("_______________");
    }

}
