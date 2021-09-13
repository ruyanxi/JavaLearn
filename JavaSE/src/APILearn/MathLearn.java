package APILearn;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: MathLearn
 * @ProjectName: java-se-learning
 * @Description： Math类的常用方法学习
 * @date： 2021/8/27 10:36
 */
public class MathLearn {
    public static void main(String[] args) {
//public static int abs(int a)|------>返回参数的绝对值|
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("------------------------");

//public static double ceil(double a)|------>返回大于或等于参数的最小double值，等于一个整数|
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(56.78));
        System.out.println("------------------------");
//public static double floor(double a)|------>返回小于或等于参数的最大double值,等于一个整数|
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(56.78));
        System.out.println("------------------------");
//public static int round(float a)|------>按四舍五入返回最接近参数的int|
        System.out.println(Math.round(12.34f));
        System.out.println(Math.round(56.78f));
        System.out.println("------------------------");
//public static int max(int a,int b)|------>返回两个int值中的较大值|
        System.out.println(Math.max(12,34));
        System.out.println(Math.max(56,78));
        System.out.println("------------------------");
//public static int min(int a,int b)|------>返回两个int值中的较小值|
        System.out.println(Math.min(12,34));
        System.out.println(Math.min(56,78));
        System.out.println("------------------------");
//public static double pow(double a,double b)|------>返回a的b次幂|
        System.out.println(Math.pow(1.0,2.0));
        System.out.println(Math.pow(3.0,4.0));
        System.out.println("------------------------");
//public static double random|------>返回值为double的正值，[0.0,1.0)
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println("------------------------");

        System.out.println((int)(Math.random()*10000));
    }
}
