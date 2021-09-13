package Tools;

import java.util.Scanner;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: DateSum
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/25 16:29
 */
public class DateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //一、 1. 输入要查询的年份和月份
        boolean b = false;
        while (b = false){
            System.out.println("输入开始日期：");
            int start = sc.nextInt();
            if (start<1000){
                System.out.println("日期错误！");
                break;
            }
            System.out.println("输入结束日期：");
            int end = sc.nextInt();
            if (end<start){
                System.out.println("日期错误！结束日期不能晚于开始日期");
                break;
            }
        }


        int days = 0;

//        if ((start - end) / 10000 > 0) {
//            for (int i = start;start<end;start++){
//                if (start % 4 == 0 && start % 100 != 0 || start % 400 == 0){
//                    days +=366;
//                } else {
//                    days +=365;
//                }
//            }
//        } else {
//
//        }


        /*
        System.out.print("请输入要查询的年份：");
        int year = sc.nextInt();
        System.out.print("请输入要查询的月份：");
        int month = sc.nextInt();

        //二、 处理：（1）year年month月1日是星期几；（2）year年month月有多少天
        //2.计算1900年1月1日到year-1年12月31日，共计多少天
        int sum1 = 0;
        for (int y = 1900; y < year; y++) {
            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {//满足闰年的条件
                sum1 += 366;
            } else {//平年
                sum1 += 365;
            }
        }
        //3.求year年1月至month-1月共计多少天
        int sum2 = 0;
        for (int m = 1; m < month; m++) {
            int days = 0;//m月份的天数
            if (m == 2) {
                days = (year % 4 == 0 && year % 400 != 0 || year % 400 == 0) ? 29 : 28;
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                days = 30;
            } else {
                days = 31;
            }

            sum2 += days;
        }

        //4.计算month月份的第1天是星期几？
        int day = (sum1 + sum2 + 1) % 7;//0：星期日。1~6：星期一~星期六。
        //year年month月有多少天？
        int days = 0;
        switch (month) {
            case 2:
                days = (year % 4 == 0 && year % 400 != 0 || year % 400 == 0) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;//此处break可省略。
        }

        //三、 打印输出year年month月的日历
        System.out.println("\t\t" + year + "年" + month + "月\n------------------------------------------------------");
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
        for (int i = 0; i < day; i++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= days; i++) {
            System.out.print(i + "\t");
            if ((i + day) % 7 == 0)
                System.out.println();
        }
        sc.close();
        */
    }

    /**验证输入日期*/
    public static boolean DateSense(int date){
        boolean b = true;

        if (date <10000000){
            b = false;
        } else {

        }

        return b;
    }
}
