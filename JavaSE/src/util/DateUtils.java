package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Rob
 * @Description:
 * 定义一个日期工具类（DateUtils），包含两个方法：把日期转换为指定格式的字符串；把字符串解析为指定格式的日期，然后定义一个测试类（DateDemo），测试日期工具类的方法。
 */
public class DateUtils {
    private DateUtils(){}

    public static String dateToString(Date date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    public static Date stringToDate(String str, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(str);

    }
}
