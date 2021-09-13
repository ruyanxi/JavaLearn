package StringLearn;

/**
 * @author:朢曐(雷杨一凡)
 * @Title:StringBuilderToString
 * @ProjectName:java-se-learning
 * @Description：StringBuilder 转换为 String：
 *                  public String toString(): 通过 toString()就可以实现把 StringBuilder 装换为 String
 *              以及 String 转换为 StringBuilder：
 *                  public StringBuilder(String s): 通过构造方法就可以实现把 String 装换为 StringBuilder
 * @date：2021/8/23 18:18
 */
public class StringBuilderToString {
    public static void main(String[] args) {
        //StringBUilder To String

        StringBuilder sb1 = new StringBuilder();
        sb1.append("hello");

        //String s = sb; 的做法是错误的，应使用 toString():
        //public String toString(): 通过 toString()就可以实现把 StringBuilder 装换为 String

        String s1 = sb1.toString();
        System.out.println(s1);

        //String To StingBuilder


        String s2 = "Hello";
        //StringBuilder sb2 = s2;同上，直转是不受支持的
        //public StringBuilder(String s): 通过构造方法就可以实现把 String 装换为 StringBuilder
        StringBuilder sb2 = new StringBuilder(s2);
        System.out.println(sb2);
    }
}
