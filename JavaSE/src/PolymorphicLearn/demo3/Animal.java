package PolymorphicLearn.demo3;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Animal
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 8:39
 */
public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("动物 吃 东西");
    }
}
