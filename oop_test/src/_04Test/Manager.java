package _04Test;

public class Manager extends Employee implements Meeting{

    private int bonus;

    public Manager(String name, String employeeId, double baseSalary, int bonus) {
        super(name, employeeId, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return this.getBaseSalary() + bonus;
    }

    @Override
    public void attendTraining() {
        System.out.println(this.getName() + "正在参加管理培训");
    }

    @Override
    public void conveneMeet() {
        System.out.println(this.getName() + "正在召开会议");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("奖  金：" + this.bonus);
        System.out.println("工  资：" + this.calculateSalary());
    }
}
