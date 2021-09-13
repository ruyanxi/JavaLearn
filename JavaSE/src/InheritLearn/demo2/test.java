package InheritLearn.demo2;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: test
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/25 10:00
 */
public class test {
    public static void main(String[] args) {
        //带参构造
        Dog d1 = new Dog("polo",1);
        Cat c1 = new Cat("Anna",2);
        //调用方法
        d1.watch();
        c1.catchMouse();

        //无参构造
        System.out.println("-------------------------");
        Dog d2 = new Dog();
        Cat c2 = new Cat();
        //对无参对象赋值
        d2.setName("Kisa");
        d2.setAge(3);

        c2.setName("cafe");
        c2.setAge(5);
        //调用方法
        d2.watch();
        c2.catchMouse();
    }
}
