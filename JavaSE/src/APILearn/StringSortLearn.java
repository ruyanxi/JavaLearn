package APILearn;

import java.util.Arrays;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: StringSortLearn
 * @ProjectName: java-se-learning
 * @Description： 对一个已知的数值型字符串进行数据排序
 * 1. 通过split()方法得到字符串中的每一个数字数据，再使用parseInt()将其存储到一个int类型的数组中
 * @date： 2021/8/30 15:33
 */
public class StringSortLearn {
    public static void main(String[] args) {
        //初始化数组
        String str = "91 27 46 38 50";
        //使用split()将字符串转换为String类型的数组
        String[] ArrayStr = str.split(" ");
        int[] ArrayInt = new int[ArrayStr.length];
        for (int i = 0; i < ArrayStr.length; i++) {
            ArrayInt[i] = Integer.parseInt(ArrayStr[i]);
        }

        Arrays.sort(ArrayInt);

        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < ArrayInt.length; i++) {
            s.append(ArrayInt[i]);
            if (i == ArrayInt.length-1) {
                s.append("]");
            }else {
                s.append(", ");
            }
        }
        String result = s.toString();
        System.out.println(result);


    }
}
