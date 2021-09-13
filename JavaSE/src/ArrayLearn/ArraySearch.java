package ArrayLearn;

import java.util.Scanner;

public class ArraySearch {
    /*查找数组元素的索引值，若不存在元素则输出-1
     * */
    public static void main(String[] args) {
        //设定默认索引值-1
        int s = -1;
        //预设数组：
        int[] arr = {12, 23, 34, 45, 56, 67, 78, 89, 90};
        //获取输入值及输入提示：
        System.out.println("请输入带查询的元素值：");
        int x = new Scanner(System.in).nextInt();
        //使用for循环遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                s = i;
                System.out.println("输入值：" + x + " 元素在数组中的索引是：" + s);
                break;
            }
        }
        if (s == -1) {
            System.out.println("元素不存在于数组中！");
            System.out.println("输出默认索引：" + s);
        }
    }
}
