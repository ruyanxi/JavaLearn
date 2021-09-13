package PolymorphicLearn.demo;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: test
 * @ProjectName: java-se-learning
 * @Description:
 * @date: 2021/8/25 19:34
 */
public class test {
    public static void main(String[] args) {
        //创建动物操作类的对象，调用方法
        AnimalOperator ao = new AnimalOperator();
        Cat a = new Cat();
        Dog d = new Dog();
        Pig p = new Pig();


        ao.userAnimal(a);
        ao.userAnimal(d);
        ao.userAnimal(p);
    }
}
