package PortLearn.demo2;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: test
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 13:18
 */
public class test {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        System.out.println(i.num);
        System.out.println(i.num2);
        System.out.println("-----");
        System.out.println(Inter.num);
        System.out.println(Inter.num2);
    }
}
