package PortLearn.demo4;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Athletes
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 14:31
 */
public abstract class Athletes extends People{
    public Athletes() {
    }

    public Athletes(String name, int age) {
        super(name, age);
    }

    public abstract void sport();
    public abstract void learn();
}
