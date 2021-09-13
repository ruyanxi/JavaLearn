package StringLearn;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        //获取字符串
        System.out.println("请输入一个字符串：");
        String s = new Scanner(System.in).nextLine();
        //设定统计量及初始值
        int num = 0;
        int capital = 0;//大写字母
        int lowercase = 0;//小写字母

        for (int i = 0; i < s.length();i++){
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                capital++;
            }else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                lowercase++;
            }else  {
                num++;
            }
        }

        System.out.println("该字符串共有" +capital+ "个大写字母、" +lowercase+ "个小写字母和" +num+ "个数字");

    }
}
