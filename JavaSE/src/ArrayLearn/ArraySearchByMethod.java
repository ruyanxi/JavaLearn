package ArrayLearn;

import java.util.Scanner;

/**
 * @author &
 */
public class ArraySearchByMethod {
    //使用方法改进原ArraySearch中的代码，使得查询操作在一个单独的方法中实现

    public static void main(String[] args) {
        int[] arr = {12,23,34,45,56,67,78,89,90};
        System.out.println("请输入待查询的元素值：");
        int x = new Scanner(System.in).nextInt();

        System.out.println("index:"+arraySearch(arr,x));

    }
    public static int arraySearch(int[] arr, int x) {
        int s = -1;
        for (int i = 0 ; i < arr.length; i++) {
            if (x == arr[i]) {
                s= i;
                System.out.println("输入值："+x+" 在数组中的索引为"+s);
                break;
            }
        }
        if (s == -1) {
            System.out.println("元素不存在于数组中！");
        }
        return s;
    }
}
