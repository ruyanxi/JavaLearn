package APILearn.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: SimpleDateFormatLearn
 * @ProjectName: java-se-learning
 * @Description： 日期类测试2：
 * SimpleDateFormat
 * * 构造方法：
 * * public SimpleDateFormat()                    构造一个SimpleDateFormat，使用默认模式和日期格式
 * * public SimpleDateFormat(String pattern)      构造一个SimpleDateFormat使用给定的模式和默认的日期格式
 * *
 * * 格式化:  从Date到String
 * * public final String format(Date date): 将日期格式化成日期/时间字符串
 * * 解析：   从String到Date
 * * public Date parse(String source): 从给定字符串的开始解析文本以生成日期
 * @date： 2021/9/1 11:14
 */
public class SimpleDateFormatLearn {
    public static void main(String[] args) throws ParseException {

        //SimpleDateFormat

        //格式化:  从Date到String
        Date d = new Date();
        //无参构造方法
//        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println("------------_-------------");

        //解析： 从String到Date
        String ss = "2001-06-20 05:23:17";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(ss);
        System.out.println(dd);

    }
}
