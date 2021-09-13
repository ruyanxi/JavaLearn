package PolymorphicLearn.demo;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Dog
 * @ProjectName: java-se-learning
 * @Description:
 * @date: 2021/8/25 19:43
 */
public class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("狗 吃 骨头");
    }
}
