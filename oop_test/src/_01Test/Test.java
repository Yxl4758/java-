package _01Test;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Chinese("张三",'男',20);
        Person p2 = new English("史蒂文",'男',22);

        showEat(p1);
        showEat(p2);
    }
    public static void showEat(Person p) {
        if(p instanceof Chinese chinese){
            System.out.println(chinese);
            chinese.eat();
            chinese.shadowBoxing();
        }else if(p instanceof English english){
            System.out.println(english);
            english.eat();
            english.horseRiding();
        }
    }
}
