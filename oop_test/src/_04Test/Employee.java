package _04Test;

public abstract class Employee {
    private String name;
    private String employeeId;
    protected double baseSalary;

    public Employee(String name, String employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();
    public abstract void attendTraining();

    public void displayInfo() {
        System.out.println("员工姓名：" + this.getName());
        System.out.println("工   号：" + this.getName());
    }
}
