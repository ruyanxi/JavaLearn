package PortLearn.demo4;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: BasketBallCoach
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 14:56
 */
public class BasketBallCoach extends Coach{
    public BasketBallCoach() {
    }

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void training() {
        System.out.println("教授运动员打篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练员吃正常餐");
    }
}
