package PolymorphicLearn.demo3;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Dog
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 8:39
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗 吃 骨头");
    }

    public void play(){
        System.out.println("狗 玩 飞盘");
    }
}
