package StringLearn;

import java.util.Scanner;

/**
 * @author:朢曐(雷杨一凡)
 * @Title:StringInversionNew
 * @ProjectName:java-se-learning
 * @Description：字符串反转 V2.0
 * 定义方法，实现字符串反转，键盘输入字符串，调用方法后在控制台输出结果
 * @date：2021/8/23 19:07
 */
public class StringInversionNew {
    public static void main(String[] args) {
        //输入提示并获取字符串
        System.out.println("请输入一个字符串：");
        String str = new Scanner(System.in).nextLine();
        System.out.println("your String:" + str);
        //调用方法反转并接受返回值
        str = Inversion(str);

        System.out.println("Inversion String:" + str);
    }

    public static String Inversion(String str) {
//        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
//        return sb.toString();
        //精简化上方代码
        return new StringBuilder(str).reverse().toString();
    }
}
