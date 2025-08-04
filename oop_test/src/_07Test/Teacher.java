package _07Test;

public class Teacher extends Person{

    private String teacherId;
    private String department;

    public Teacher(String name, int age, String teacherId, String department) {
        super(name, age);
        this.teacherId = teacherId;
        this.department = department;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getDepartment() {
        return department;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void teach(String course){
        System.out.println(getName() + "在教授" + course);
    }

    @Override
    public void displayInfo() {
        System.out.println("姓名：" + getName()+ "\t" + "年龄：" + getAge()+ "\t" + "工号：" + getTeacherId()+ "\t" + "部门：" + getDepartment());
    }
}
