package APILearn.Date;

import java.util.Date;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: DateLearn
 * @ProjectName: java-se-learning
 * @Description： 日期类测试1：
 * Date类
 * public Date()                分配一个Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
 * public Date(long date)       分配一个Date对象，并将其初始化为代表从标准基准时间起指定的毫秒数
 * <p>
 * public long getTime()                获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
 * public viod setTime(long time)       设置时间，给的是毫秒值
 * @date： 2021/8/31 11:24
 */
public class DateClassLearn {
    public static void main(String[] args) {

        //Date类

        //public Date()                分配一个Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
        Date d1 = new Date();
        System.out.println(d1);

        //public Date(long date)       分配一个Date对象，并将其初始化为代表从标准基准时间起指定的毫秒数
        long date = 100 * 365L * 24000 * 60 * 60;
        Date d2 = new Date(date);
        System.out.println(d2);


        //创建日期对象
        Date d = new Date();

        //public long getTime()                获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
        System.out.println(d.getTime());
        System.out.println(d.getTime() / 1000 / 60 / 60 / 24 / 365 + "年");
        //public viod setTime(long time)       设置时间，给的是毫秒值

        //long time = 1000 * 60 * 60;
        long time = System.currentTimeMillis();
        d.setTime(time);
        System.out.println(d);
    }

}
