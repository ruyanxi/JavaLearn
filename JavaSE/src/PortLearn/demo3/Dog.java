package PortLearn.demo3;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Dog
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 13:19
 */
public class Dog extends Animal implements Jumpping{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗 吃 骨头");
    }

    @Override
    public void jump() {
        System.out.println("狗 跳高");
    }
}
