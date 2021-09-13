package AbstractLearn.demo2;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Animal
 * @ProjectName: java-se-learning
 * @Description：
 * 抽象类
 * 研究抽象类可以包含哪些成员：
 * 成员变量、构造方法、成员方法
 * @date： 2021/8/26 9:31
 */
public abstract class Animal {
    //变量
    private int age = 20;
    //常量
    private final String city = "北京";
//    city = "上海";
    //无参构造方法 ---用于子类访问父类数据的初始化，子类的构造方法会访问父类的构造方法用来访问父类的数据以初始化。
    public Animal(){

    }
    //带参构造方法
    public Animal(int age) {
        this.age = age;
    }

    //非抽象成员方法
    public void show(){
        age = 40;
        System.out.println(age);
        //    city = "上海";  //常量不允许修改
        System.out.println(city);
    }
    //抽象成员方法
    public abstract void eat();
}
