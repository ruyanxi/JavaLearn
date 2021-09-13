package StringLearn;

import java.util.Scanner;

public class PrintString {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        String s = new Scanner(System.in).nextLine();

        for (int i = 0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
}
