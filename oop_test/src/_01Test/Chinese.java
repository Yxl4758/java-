package _01Test;

public class Chinese extends Person{

    public Chinese(String name, char gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("我是中国人，我喜欢吃饭！");
    }

    public void shadowBoxing(){
        System.out.println(super.getName() + "正在联系太极拳！");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}