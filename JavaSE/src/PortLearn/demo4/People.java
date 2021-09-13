package PortLearn.demo4;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: people
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 14:27
 */
public abstract class People {
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
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

    public abstract void eat();
}
