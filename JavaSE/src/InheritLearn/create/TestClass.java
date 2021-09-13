package InheritLearn.create;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: TestClass
 * @ProjectName: java-se-learning
 * @Description：
 *      测试类
 * @date： 2021/8/25 9:06
 */
public class TestClass {
    public static void main(String[] args) {
        //创建对象，调用方法
        SuperClass superClass = new SuperClass(1);
        superClass.show();

        SubClass subClass = new SubClass(1);
        subClass.show();
    }
}
