package AbstractLearn.demo3;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: test
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 11:32
 */
public class test {
    public static void main(String[] args) {
        Animal a1 = new Cat("Garfield",5);
        Animal a2 = new Dog("Jorge",7);
        Animal a3 = new Pig("Peppa",1);

        a1.eat();
        a1.show(a1);

        a2.eat();
        a2.show(a2);

        a3.eat();
        a3.show(a3);

        System.out.println("------------------------------");

        Animal a4 = new Cat();
        a4.setName("Mitty");
        a4.setAge(2);
        Animal a5 = new Dog();
        a5.setName("Odie");
        a5.setAge(3);
        Animal a6 = new Pig();
        a6.setName("PiPi");
        a6.setAge(5);

        a4.eat();
        a4.show(a4);
        a5.eat();
        a5.show(a5);
        a6.eat();
        a6.show(a6);


    }
}
