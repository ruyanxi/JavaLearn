package PolymorphicLearn.demo2;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: test
 * @ProjectName: java-se-learning
 * @Description:
 * @date: 2021/8/25 20:13
 */
public class test {
    public static void main(String[] args) {
        //多态
        Animal a = new Cat();   //向上转型
        a.eat();

        //向下转型
        Cat c = (Cat) a;
        c.eat();
        c.playGame();
    }
}
