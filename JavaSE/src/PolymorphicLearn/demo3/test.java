package PolymorphicLearn.demo3;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: test
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 8:39
 */
public class test {
    public static void main(String[] args) {
        //创建猫类进行测试
        Animal a = new Cat();
        a.setName("cafe");
        a.setAge(5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        Cat c = (Cat) a;
        c.play();

        a = new Cat("Polo", 2);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        //创建狗类进行测试
        Animal a2 = new Dog();
        a2.setName("Gaze");
        a2.setAge(3);
        System.out.println(a2.getName() + ", " + a2.getAge());
        a2.eat();

        Dog d = (Dog) a2;
        d.play();

        a2 = new Dog("Andi", 8);
        System.out.println(a2.getName() + ", " + a2.getAge());
        a2.eat();
    }
}
