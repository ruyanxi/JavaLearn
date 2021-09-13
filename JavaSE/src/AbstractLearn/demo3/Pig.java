package AbstractLearn.demo3;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Pig
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 11:32
 */
public class Pig extends Animal{
    public Pig() {
    }

    public Pig(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猪 吃 白菜");
    }
}
