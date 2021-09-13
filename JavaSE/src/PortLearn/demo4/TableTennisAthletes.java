package PortLearn.demo4;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: TableTennis
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 14:35
 */
public class TableTennisAthletes extends Athletes implements LearnEnglish{
    public TableTennisAthletes() {
    }

    public TableTennisAthletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void sport() {
        System.out.println("运动员打乒乓球");
    }

    @Override
    public void learn() {
        System.out.println("运动员学习打乒乓球");
    }

    @Override
    public void learnEnglish() {
        System.out.println("运动员学习英语");
    }

    @Override
    public void eat() {
        System.out.println("乒乓运动员吃特殊营养餐");
    }
}
