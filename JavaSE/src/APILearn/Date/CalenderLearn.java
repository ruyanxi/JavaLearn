package APILearn.Date;

import java.util.Calendar;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: CalenderLearn
 * @ProjectName: java-se-learning
 * @Description： public int get(int fieId)                              返回给定日期字段的值
 * public abstract void add(int fieId,int amount)         根据日历的规则，将指定的时间量添加或减去给定的日历字段
 * public final void set(int year,int month,int date)     设置当前日历的年月日
 * @date： 2021/9/1 11:16
 */
public class CalenderLearn {
    public static void main(String[] args) {
        //获取对象-利用多态的形式
        Calendar c = Calendar.getInstance();

//        System.out.println(c);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);

        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        int date = c.get(Calendar.DATE);
        System.out.println(year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second);

        System.out.println(date);


        //public int get ( int fieId)返回给定日期字段的值

        //public abstract void add ( int fieId, int amount)根据日历的规则，将指定的时间量添加或减去给定的日历字段

        //public final void set ( int year, int month, int date)设置当前日历的年月日

    }
}
