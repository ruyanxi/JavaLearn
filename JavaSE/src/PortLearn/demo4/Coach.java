package PortLearn.demo4;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Coach
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 14:33
 */
public abstract class Coach extends People{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void training();
}
