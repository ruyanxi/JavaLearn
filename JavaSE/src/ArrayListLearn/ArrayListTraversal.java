package ArrayListLearn;

import java.util.ArrayList;

/**
 * @author:朢曐(雷杨一凡)
 * @Title:ArrayListTraversal
 * @ProjectName:java-se-learning
 * @Description：    存储字符串并遍历
 *              创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
 * @date：2021/8/24 8:39
 */
public class ArrayListTraversal {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<>();

        //往集合中添加字符串对象
        array.add("Rob");
        array.add("Taylor");
        array.add("Troye");
        array.add("sivan +");

        //遍历集合
//        System.out.println(array.get(0));
//        System.out.println(array.get(1));
//        System.out.println(array.get(2));
        //改进为for循环
        for (int i = 0;i<array.size();i++){
            System.out.println(array.get(i));
        }

    }
}
