package _07Test;

public class Student extends Person {

    private String studentId;
    private String major;

    public Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfo() {
        System.out.println("姓名：" + getName() + "\t" +"年龄：" + getAge()+ "\t" +"学号：" + getStudentId()+ "\t" +"专业：" + getMajor());
    }

    public void study(String course){
        System.out.println(getName() + "正在学习" + course);
    }
}
