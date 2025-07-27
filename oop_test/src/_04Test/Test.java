package _04Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new GeneralStaff("张三","E0001", 3000,160));
        employees.add(new Manager("张三","E0002", 5000,2000));
        employees.add(new TechnicalExpert("张三","E0003", 6000,4000,Arrays.asList("Java", "Python", "C++")));

        for (Employee employee : employees) {
            employee.displayInfo();
            employee.attendTraining();
            if (employee instanceof Meeting meeting) {
                meeting.conveneMeet();
            }
            System.out.println("------------------");
        }
    }
}
