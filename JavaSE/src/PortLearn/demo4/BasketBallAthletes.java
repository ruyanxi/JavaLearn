package PortLearn.demo4;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: BasketBall
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 14:36
 */
public class BasketBallAthletes extends Athletes {
    public BasketBallAthletes() {
    }

    public BasketBallAthletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void sport() {
        System.out.println("运动员打篮球");
    }

    @Override
    public void learn() {
        System.out.println("运动员学习打篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃特殊营养餐");
    }
}
