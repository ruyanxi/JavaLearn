package Tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: DateCounter
 * @ProjectName: java-se-learning
 * @Description：
 * 21-2-12/21-8-26=195
 *
 * @date： 2021/8/25 16:19
 */
public class DateCounter {
    public static void main(String[] args) throws ParseException {
        String date1 = "2021-08-01 00:00:00";
        String date2 = "2021-08-26 00:00:00";

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date beginDate = df.parse(date1);
        Date endDate = df.parse(date2);

        long betweenDate = (endDate.getTime()- beginDate.getTime())/(1000*60*60*24);

        System.out.println("开始日期："+beginDate);
        System.out.println("结束日期："+endDate);
        System.out.println("相隔天数："+betweenDate);
    }
}
