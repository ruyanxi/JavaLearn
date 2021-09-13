package InheritLearn.create;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: SubClass
 * @ProjectName: java-se-learning
 * @Description：
 *      子类
 * @date： 2021/8/25 9:05
 */
public class SubClass extends SuperClass {
    public SubClass(){
        System.out.println("子类的无参构造方法被调用！");
    }
    public SubClass(int i){
        System.out.println("子类的带参构造方法被调用！");
    }

    @Override
    public  void show() {
        System.out.println("子方法被调用！");
    }
}
