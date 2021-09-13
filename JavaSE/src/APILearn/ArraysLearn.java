package APILearn;

import java.util.Arrays;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: ArraysLearn
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/27 13:48
 */
public class ArraysLearn {
    public static void main(String[] args) {
        //定义了一个数组
        int[] arr  = {123,234,345,234,543,673,436};

        System.out.println("排序前"+ Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("排序后"+ Arrays.toString(arr));

    }
}
