package PortLearn.demo4;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: TableTennisCoach
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 14:57
 */
public class TableTennisCoach extends Coach implements LearnEnglish{
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void training() {
        System.out.println("教授运动员打乒乓球");
    }

    @Override
    public void learnEnglish() {
        System.out.println("教练学英语");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练员吃正常餐");
    }
}
