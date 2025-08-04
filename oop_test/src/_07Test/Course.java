package _07Test;

public class Course {
    private String courseName;
    private String courseId;
    private Teacher teacher;

    public Course(String courseName, String courseId, Teacher teacher) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void displayCourseInfo() {
        System.out.println("课程名：" + getCourseName() + "\t课程编号：" + getCourseId() + "\t授课教师：" + getTeacher().getName());
    }
}
