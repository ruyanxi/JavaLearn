package PortLearn.demo3;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Cat
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 13:19
 */
public class Cat extends Animal implements Jumpping{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫 吃 鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫 跳高");
    }
}
