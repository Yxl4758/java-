##### 题目描述：

###### 设计一个简单的学校管理系统，包含以下类：

1. Person类（抽象类）：

   \- 属性：name（姓名，String类型），age（年龄，int类型），使用合适的访问修饰		符。

   \- 构造方法：有参构造方法（name和age）。

   \- 抽象方法：void displayInfo()，用于显示信息。

2. Student类（继承Person类）：

   \- 额外属性：studentId（学号，String类型），major（专业，String类型）。

   \- 构造方法：包括name, age, studentId, major。

   \- 重写displayInfo()方法，打印学生信息（包括姓名、年龄、学号、专业）。

   \- 实现一个方法：void study(String course)，打印学生在学习某门课程。

3. Teacher类（继承Person类）：

   \- 额外属性：teacherId（工号，String类型），department（部门，String类型）。

   \- 构造方法：包括name, age, teacherId, department。

   \- 重写displayInfo()方法，打印教师信息（包括姓名、年龄、工号、部门）。

   \- 实现一个方法：void teach(String course)，打印老师在教授某门课程。

4. Course类：

   \- 属性：courseName（课程名称，String类型），courseId（课程编号，String类		型），teacher（授课教师，Teacher类型）。

   \- 构造方法：包括courseName, courseId, teacher。

   \- 方法：void displayCourseInfo()，显示课程信息（包括课程名、课程编号、授课教师		姓名）。

5. School类（包含主方法）：

   \- 在main方法中：

​        a. 创建两个Student对象和两个Teacher对象。

​        b. 创建一个Course对象，并指定一个教师授课。

​        c. 将学生和教师对象放入一个Person数组中（体现多态）。

​        d. 遍历Person数组，调用每个对象的displayInfo()方法。

​        e. 调用学生对象的学习方法和教师对象的授课方法（注意：需要类型判断和向下		转型）。

​        f. 调用Course对象的displayCourseInfo()方法。