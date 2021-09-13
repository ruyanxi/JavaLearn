package StringLearn;

import java.util.Scanner;

public class StringInversion {
    //使用方法进行字符串反转
    public static void main(String[] args) {
        //获取字符串
        System.out.println("请输入一个字符串：");
        String str = new Scanner(System.in).nextLine();
        //打印输出原字符串
        System.out.println("原字符串："+ str);
        System.out.println("--------------------");

        //使用方法倒置
        str = String_Inversion(str);
        //打印输出新字符串
        System.out.println("新字符串："+str);
    }

    //倒置字符串方法
    public static String String_Inversion (String str) {

//        char[] b = new char[str.length()];
//
//        for (int start=0,end=str.length()-1;start<end;start++,end--) {
//            char temp = b[start];
//            b[start] = b[end];
//            b[end] = temp;
//        }
//        str = new String(b);

        String strTemp = "";

        for (int i = str.length()-1;i>=0;i--){
            strTemp += str.charAt(i);
        }

        return strTemp;
    }
}
