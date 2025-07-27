package _04Test;

import java.util.List;

public class TechnicalExpert extends Employee implements Meeting{
    private int projectBonus;
    private List<String> skills;

    public TechnicalExpert(String name, String employeeId, double baseSalary, int projectBonus, List<String> skills) {
        super(name, employeeId, baseSalary);
        this.projectBonus = projectBonus;
        this.skills = skills;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + projectBonus;
    }

    @Override
    public void attendTraining() {
        System.out.println(this.getName() + "正在参加技术培训");
    }

    @Override
    public void conveneMeet() {
        System.out.println(this.getName() + "正在召开技术研讨会");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("项目奖金：" + this.projectBonus);
        System.out.println("本月工资：" + this.calculateSalary());
        System.out.println("技能列表：" + this.skills);
    }
}
