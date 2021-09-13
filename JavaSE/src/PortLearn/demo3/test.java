package PortLearn.demo3;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: test
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 13:19
 */
public class test {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.jump();
        System.out.println("____________");

        Animal a1 = new Cat();
        Animal a2 = new Dog();

        a1.setName("Kitty");
        a2.setName("Geo");
        a1.setAge(3);
        a2.setAge(5);

        System.out.println(a1.getName()+", "+a1.getAge());
        a1.eat();
        System.out.println(a2.getName()+", "+a2.getAge());
        a2.eat();
        System.out.println("-----------------------------");



        Cat c = new Cat("Garfield",5);
        Dog d = new Dog("Odie",3);

        c.eat();
        c.jump();

        d.eat();
        d.jump();
    }
}
