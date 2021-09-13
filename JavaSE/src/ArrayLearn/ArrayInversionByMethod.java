package ArrayLearn;

/**
 * @author &
 */
public class ArrayInversionByMethod {
    /*基于ArrayInversion改进为方法实现数组元素顺序倒置*/

    public static void main(String[] args) {
        int[] arr = {1,12,23,34,45,56,67,78,89,90,13};

        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + "\t");
            if (i == arr.length -1) {
                System.out.println("\n------------------------------------");
            }
        }

        System.out.println("执行反转操作");
        arrayInversion(arr);

        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + "\t");
            if (i == arr.length -1) {
                System.out.println("\n------------------------------------");
            }
        }

    }
    public static void arrayInversion(int[] arr) {
        int temp;
//        for (int i = 0 ; i < arr.length/2;i++){
//            temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length -1 -i] = temp;
//        }
        //在for循环中声明两个变量：同种类型，在开头使用一个数据类型声明，各变量用英文半角","隔开。
        for (int start = 0, end = arr.length-1;start<=end;start++,end--) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

    }
}
