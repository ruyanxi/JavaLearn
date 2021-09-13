package Tools;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 朢曐
 * @date 2021/8/23
 * 通过身份证号计算年龄
 */
public class AgeCalculator {
    public static void main(String[] args) {
        //预获取身份证号码
        System.out.println("请输入身份证");
        String SId = new Scanner(System.in).nextLine();
        if (SId.length() != 18) {
            System.out.println("请输入有效的身份证号码！");
            return;
        }
        //从身份证中获取出生年月日并转换为String
        char[] birthDate = new char[8];
        for (int i = 0;i<8;i++){
            birthDate[i]=SId.charAt(i+6);
        }
        String birth = new String(birthDate);

        //获取当前日期并转换为字符串
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        String nowDate = df.format(date);

        //根据二者转换出年龄
        int age = (Integer.parseInt(nowDate)-Integer.parseInt(birth))/10000;

        //输出年龄
        System.out.println(age);

    }
}
