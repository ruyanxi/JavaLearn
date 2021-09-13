package PolymorphicLearn.demo3;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Cat
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 8:39
 */
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫 吃 鱼");
    }

    public void play(){
        System.out.println("猫 玩 毛线球");
    }
}
