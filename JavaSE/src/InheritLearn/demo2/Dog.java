package InheritLearn.demo2;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Dog
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/25 10:00
 */
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void watch() {
        System.out.println(this.getName() +", "+ this.getAge() + ", stay at home and watching....");
    }
}
