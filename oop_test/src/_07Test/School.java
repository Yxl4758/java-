package _07Test;

import java.util.ArrayList;
import java.util.List;

public class School {
    public static void main(String[] args) {
        Student stu = new Student("张三",18,"S0001","智能科学与技术");
        Teacher tch1 = new Teacher("李四",36,"T0001","计算机学院");
        Teacher tch2 = new Teacher("王五",34,"T0002","计算机学院");

        Course cor = new Course("人工智能","C0001",tch1);
        List<Person> persons = new ArrayList<Person>();
        persons.add(stu);
        persons.add(tch1);
        persons.add(tch2);
        persons.forEach(Person::displayInfo);
        persons.forEach(person -> {
            if (person instanceof Student) {
                ((Student) person).study(cor.getCourseName());
            }else if(person instanceof Teacher){
                ((Teacher)person).teach(cor.getCourseName());
            }
        });
        cor.displayCourseInfo();
    }
}
