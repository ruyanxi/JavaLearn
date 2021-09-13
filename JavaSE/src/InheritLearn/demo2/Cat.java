package InheritLearn.demo2;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Cat
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/25 10:00
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchMouse(){
        System.out.println(this.getName()+", "+this.getAge()+", searching mouse....");
    }

}
