package PortLearn.demo4;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: test
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 15:05
 */
public class test {
    public static void main(String[] args) {
        BasketBallAthletes ba = new BasketBallAthletes("张三",23);
        BasketBallCoach bc = new BasketBallCoach("李四",45);

        TableTennisAthletes ta = new TableTennisAthletes("王五",19);
        TableTennisCoach tc = new TableTennisCoach("赵六",38);

        System.out.println(ba.getName()+", "+ba.getAge());
        ba.eat();
        ba.sport();
        ba.learn();
        System.out.println("____________________");
        System.out.println(bc.getName()+", "+bc.getAge());
        bc.eat();
        bc.training();
        System.out.println("____________________");
        System.out.println(ta.getName()+", "+ta.getAge());
        ta.eat();
        ta.sport();
        ta.learn();
        System.out.println("____________________");
        System.out.println(tc.getName()+", "+tc.getAge());
        tc.eat();
        tc.training();
        System.out.println("____________________");

    }
}
