package homeWork.HW20;

import jakarta.xml.bind.JAXB;
import lombok.SneakyThrows;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class EmployeeRunner {
    private static int size = 1;

    private static Employee getEmployee(String FIO) {

        return new Employee()
                .setEmployeeID(new Random().nextInt(100000) + "")
                .setLogin("#" + size++).setFIO(FIO)
                .setDepartment(departments.get(new Random().nextInt(departments.size())))
                .setPosition(positions.get(new Random().nextInt(positions.size())));
    }

    private static final List<Department> departments = List.of(
            new Department("Progress", "Samara"),
            new Department("KUZNETSOV", "Samara"),
            new Department("Aviaagregat", "samara"));

    private static final List<Position> positions = List.of(
            new Position("VIK", new BigDecimal(50000)),
            new Position("IK1", new BigDecimal(40000)),
            new Position("IK2", new BigDecimal(30000)),
            new Position("IK3", new BigDecimal(25000)),
            new Position("IK", new BigDecimal(20000)));

    @SneakyThrows
    public static void main(String[] args) {
        EmployeeType employeeType = new EmployeeType();
        List<Employee> employees = List.of(
                getEmployee("Timofeeva Varvara Nikolaevna"),
                getEmployee("Pomidorov Timur Albertovich"),
                getEmployee("Osipov Igor Mihailovich"),
                getEmployee("Murkaeva Margarita Pavlovna"),
                getEmployee("Milimonov Lazar Illarionovich"),
                getEmployee("Popov Maxim Ivanovich"));
        employeeType.setEmployees(employees);

        Path path = Paths.get("D:\\test\\employee.xml");
        Path parentPath = path.getParent();
        if (!parentPath.toFile().exists()) {
            parentPath.toFile().mkdirs();
        }
        System.out.printf("Запись в файл %s\n ", path.getFileName());
        JAXB.marshal(employeeType, path.toFile());
        System.out.println("_______________");
        Document documentBuilder =  getDocumentBuilder(path.toFile());
        System.out.println( getAvgSalary(documentBuilder));
        Integer avgSalary = getAvgSalary(documentBuilder);
        System.out.printf("Средняя зарплата составляет %d\n", avgSalary);
        List<String> employeeList = findEmployeesWithAboveAvgSalary(documentBuilder, avgSalary);
        System.out.println(employeeList);
        String json = XML.toJSONObject(String.join("", Files.readAllLines(path))).toString();
        Path jsonPath = parentPath.resolve("employee.json");
        System.out.printf("Сохранение данных в файл %s\n", jsonPath.getFileName());
        Files.writeString(jsonPath, json, StandardOpenOption.CREATE, StandardOpenOption.WRITE);



    }

    @SneakyThrows
    private static List<String> findEmployeesWithAboveAvgSalary(Document document, int salary) {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        NodeList nodeList = (NodeList) xPathFactory.newXPath()
                .compile("//employee/position[@salary >" + salary + "]/ancestor::employee/FIO/text()")
                .evaluate(document, XPathConstants.NODESET);
        List<String> avg = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            avg.add(nodeList.item(i).getNodeValue());
        }
        return avg;
    }


    @SneakyThrows
    private static Document getDocumentBuilder(File file) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder document = factory.newDocumentBuilder();
        return document.parse(file);
    }

    @SneakyThrows
    private static Integer getAvgSalary(Document document) {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        Double avg = (Double) xPathFactory.newXPath()
                .compile("sum(//position/@salary) div count(//position) ")
                .evaluate(document, XPathConstants.NUMBER);
        return avg != null ? avg.intValue() : 0;
    }


    }

