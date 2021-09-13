package Test;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import static util.DateUtils.*;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: DateUtilsTest
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/9/1 10:36
 */
public class DateUtilsTest {
    public static void main(String[] args) throws ParseException {


        int i = 0;
        while (i == 0) {
            System.out.println("1.字符串转日期\n2.日期转字符串\n--------------\n输入序号选择功能：");
            int chose = 0;
            chose = new Scanner(System.in).nextInt();

            switch (chose) {
                case 1:
                    System.out.println("输入日期格式：");
                    String format1 = new Scanner(System.in).nextLine();
                    System.out.println("输入预转换字符串：");
                    String date1 = new Scanner(System.in).nextLine();
                    System.out.println(stringToDate(date1, format1));
                    System.out.println("---stop----");
                    i = new Scanner(System.in).nextInt();
                    break;
                case 2:
                    System.out.println("输入日期格式：");
                    String format2 = new Scanner(System.in).nextLine();
//                    System.out.println("输入预转换日期：");new Scanner(System.in).nextLine()
                    Date date2 = new Date();
                    System.out.println(dateToString(date2, format2));
                    System.out.println("---stop----");
                    i = new Scanner(System.in).nextInt();
                    break;
                default:
                    System.out.println("error!");
            }
        }

    }
}
