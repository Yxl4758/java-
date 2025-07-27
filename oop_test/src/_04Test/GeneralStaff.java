package _04Test;

public class GeneralStaff extends Employee{
    private int workHours;
    public GeneralStaff(String name, String employeeId, double basesalary, int workHours) {
        super(name, employeeId, basesalary);
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return super.getBaseSalary() + workHours * 100;
    }

    @Override
    public void attendTraining() {
        System.out.println(super.getName() + "正在参加基础技能培训");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("工作小时数：" + workHours);
        System.out.println("本月工资：" + this.calculateSalary());
    }
}
