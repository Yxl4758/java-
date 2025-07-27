package _02Test;

public class Test {
    public static void main(String[] args) {
        PingpongAthlete pingpongAthlete = new PingpongAthlete("张继科",30);
        BasketballAthlete basketballAthlete = new BasketballAthlete("蔡徐坤",31);
        PingpongCoach pingpongCoach = new PingpongCoach("刘国梁",42);
        BasketballCoach basketballCoach = new BasketballCoach("杜锋",37);

        System.out.print(pingpongAthlete);
        pingpongAthlete.sleep();
        pingpongAthlete.eat();
        pingpongAthlete.study();
        pingpongAthlete.speekEnglish();
        System.out.println("-----------------------");
        System.out.print(basketballAthlete);
        basketballAthlete.sleep();
        basketballAthlete.eat();
        basketballAthlete.study();
        System.out.println("-----------------------");
        System.out.print(pingpongCoach);
        pingpongCoach.sleep();
        pingpongCoach.eat();
        pingpongCoach.teach();
        pingpongCoach.speekEnglish();
        System.out.println("-----------------------");
        System.out.print(basketballCoach);
        basketballCoach.sleep();
        basketballCoach.eat();
        pingpongCoach.teach();
    }
}
