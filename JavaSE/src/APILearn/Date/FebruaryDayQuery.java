package APILearn.Date;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: FebruaryDayQuery
 * @ProjectName: java-se-learning
 * @Description：
 * 输入任意年数，输出2月的天数
 * 利用Calendar实现
 * @date： 2021/9/1 11:51
 */
public class FebruaryDayQuery {
    public static void main(String[] args) {
        //提示并获取年份
        System.out.print("输入年份：");
        int year = new Scanner(System.in).nextInt();

        //初始化对象 该年的3月1日
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);

        //日期向前推一天，变更为2月最后一天
        c.add(Calendar.DATE,-1);

        int days = c.get(Calendar.DATE);

        System.out.println("该年2月有"+days+"天");


    }
}
