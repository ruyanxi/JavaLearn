package StringLearn;

/**
 * @author 朢曐(雷杨一凡)
 * @date 2021/8/23 18:00
 */
public class StringBuilderLearn {

    /*
     StringBuilder 的构造方法
        public StringBuilder(): 创建一个空白的可变的字符串对象，不含有任何内容
        public StringBuilder(String str): 根据字符串的内容，来创建可变字符串对象
     */

    /*
     StringBuilder 的添加和反转方法
        public StringBuilder append(任意类型): 添加数据，并返回对象本省
        public StringBuilder reverse(): 返回相反的字符序列
     */

    public static void main(String[] args) {
        //public StringBuilder(): 创建一个空白的可变的字符串对象，不含有任何内容
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" + sb);
        System.out.println("sb.length():" + sb.length());

        //public StringBuilder(String str): 根据字符串的内容，来创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("Hello world!");
        System.out.println("sb2:" + sb2);
        System.out.println("sb2.length():" + sb2.length());

        //创建对象
        StringBuilder sb3 = new StringBuilder();

        //public StringBuilder append(任意类型): 添加数据，并返回对象本省
        StringBuilder sb4 = sb3.append("Demo");

        System.out.println("sb3:" + sb3);
        System.out.println("sb4:" + sb4);

        System.out.println(sb3 == sb4);

        //链式编程
        sb3.append("Hello").append("Java").append(100);
        //等同于,且可以一直链接下去
        sb3.append("Hello");
        sb3.append("Java");
        sb3.append(100);

        //public StringBuilder reverse(): 返回相反的字符序列
        sb4.reverse();
        System.out.println("sb4反转:"+sb4);
    }
}
