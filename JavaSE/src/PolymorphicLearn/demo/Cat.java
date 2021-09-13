package PolymorphicLearn.demo;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Cat
 * @ProjectName: java-se-learning
 * @Description:
 * @date: 2021/8/25 19:35
 */
public class Cat extends Animal {
    @Override
    public void eat(){
        System.out.println("猫 吃 鱼");
    }
}
