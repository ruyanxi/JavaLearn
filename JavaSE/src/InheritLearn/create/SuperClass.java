package InheritLearn.create;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: SuperClass
 * @ProjectName: java-se-learning
 * @Description：
 *      父类
 * @date： 2021/8/25 9:05
 */
public class SuperClass {
    public SuperClass(){
        System.out.println("父类的无参构造方法被调用！");
    }

    public SuperClass(int i){
        System.out.println("父类的带参构造方法被调用！");
    }

    public  void show() {
        System.out.println("父方法被调用！");
    }

}
