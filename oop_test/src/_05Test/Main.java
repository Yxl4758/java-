package _05Test;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Person> persons = new ArrayList<Person>(10);
    static Person person = new Person("张三",23,"123","13844645781","北京","朝阳区");
    public static void main(String[] args) {
        int operate;
        persons.add(person);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1、注册;2、登录;3、修改;4、查询");
            System.out.print("请选择操作：");
            operate = sc.nextInt();
            switch(operate){
                case 1:
                    signUp();
                    break;
                case 2:
                    signIn();
                    break;
                case 3:
                    modify();
                    break;
                case 4:
                    query();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    private static void query() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择查询类型：1、查询全部； 2.条件查询");
        int operate = sc.nextInt();
        if(operate == 1){
            if(!persons.isEmpty()){
                System.out.println("id" + "\t\t" + "name" + "\t\t" + "pwd" + "\t\t" + "age" + "\t\t" + "phone" + "\t\t" + "province" + "\t" + "city");
                for (int i = 0; i < persons.size(); i++) {
                    System.out.println((i + 1) + "\t\t" + persons.get(i).toString());
                }
            }
        } else if (operate == 2) {
            sc.nextLine();
            System.out.println("请输入要查找的用户名：");
            String name = sc.next();
            if(!persons.isEmpty()){
                int count = 0;
                System.out.println("id" + "\t\t" + "name" + "\t\t" + "pwd" + "\t\t" + "age" + "\t\t" + "phone" + "\t\t" + "province" + "\t\t" + "city");
                for (Person person : persons) {
                    if (person.getName().equals(name)) {
                        System.out.println(person.toString());
                        break;
                    }
                    count++;
                }
                if (count == persons.size()) {
                    System.out.println("查无此人");
                }
            }else {
                System.out.println("请先建立数据库！！！");
            }
        }
    }

    private static void modify() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要修改的用户名：");
        String name = sc.nextLine();
        if(!persons.isEmpty()){
            int count = 0;
            for(Person person : persons){
                if(person.getName().equals(name)){
                    System.out.print("新密码：");
                    String newPassword = sc.next();
                    person.setName(newPassword);
                    System.out.print("年龄：");
                    int age = sc.nextInt();
                    person.setAge(age);
                    System.out.print("电话号码：");
                    String phone = sc.next();
                    person.setPhone(phone);
                    System.out.print("省份：");
                    String province = sc.next();
                    person.setProvince(province);
                    System.out.print("城市：");
                    String city = sc.next();
                    person.setCity(city);
                    System.out.println("修改成功！！！");
                    break;
                }
                count++;
            }
            if(count == persons.size()){
                System.out.println("查无此人！！！");
            }
        }else{
            System.out.println("请先建立数据库！！");
        }
    }

    private static void signIn() {
        System.out.print("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("请输入密码：");
        String password = sc.nextLine();
        if (!persons.isEmpty()){
            int count = 0;
            for (Person person : persons) {
                if(person.getName().equals(name) && person.getPasswd().equals(password)){
                    System.out.println("登录成功！！！");
                    break;
                }else if(!person.getPasswd().equals(password) && person.getName().equals(name)){
                    System.out.println("密码错误！！");
                }
                count++;
            }
            if(count == persons.size()){
                System.out.println("找不到该用户！！！");
            }
        }else {
            System.out.println("找不到用户");
        }
    }

    private static void signUp() {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入用户名：");
        String name = sc.nextLine();
        String password1,password2;
        while (true){
            System.out.print("请输入密码：");
            password1 = sc.next();
            System.out.print("再次输入密码：");
            password2 = sc.next();
            if (password1.equals(password2)){
                break;
            }else {
                System.out.println("两次输入的密码不一致，请重新输入");
            }
        }
        int age;
        while (true){
            System.out.print("请输入年龄：");
            age = sc.nextInt();
            if (age < 0 || age > 100){
                System.out.println("年龄输入有误请重新输入");
            }else {
                break;
            }
        }
        System.out.print("请输入电话号码：");
        String phone = sc.next();
        System.out.print("请选择所在省份：");
        System.out.println("1、" + Province.Beijing.getName() + "\t2、" + Province.Hebei.getName() + "\t3、" + Province.Shandong.getName());
        System.out.print("请输入编号：");
        int select;
        Province province;
        while (true){
            select = sc.nextInt();
            if (select == 1){
                province = Province.Beijing;
                break;
            }else if (select == 2){
                province = Province.Hebei;
                break;
            }else if (select == 3){
                province = Province.Shandong;
                break;
            }else {
                System.out.print("输入错误请重新输入");
            }
        }
        System.out.print("请选择所在城市");
        List<String> cities;
        cities = province.getCitys();
        for (int i = 1; i <= cities.size(); i++) {
            System.out.print(i + "、" + cities.get(i - 1) + "\t");
        }
        System.out.println();
        System.out.print("请输入城市编号：");
        int number;
        String city;
        while (true){
            number = sc.nextInt();
            if (number == 1){
                city = String.valueOf(Collections.singletonList(cities.getFirst()));
                city = city.substring(1, city.length() - 1);
                break;
            }else if (number == 2){
                city = String.valueOf(Collections.singletonList(cities.get(1)));
                city = city.substring(1, city.length() - 1);
                break;
            }else if (number == 3){
                city = String.valueOf(Collections.singletonList(cities.get(2)));
                city = city.substring(1, city.length() - 1);
                break;
            }else{
                System.out.println("输入错误请重新输入！");
            }
        }
        System.out.print("是否提交(Y/N):");
        char answer = sc.next().charAt(0);
        if (answer == 'Y'){
            persons.add(new Person(name,age,password1,phone,province.getName(),city));
        }
    }
}
