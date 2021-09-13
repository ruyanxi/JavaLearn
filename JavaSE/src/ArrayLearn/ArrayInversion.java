package ArrayLearn;

/**
 * @author &
 */
public class ArrayInversion {
    /*实现数组元素顺序倒置*/

    public static void main(String[] args) {
        //预先设置数组
        int[] arr = {1, 12, 23, 34, 45, 56, 67, 78, 89, 90};
        //打印输出原数组
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        System.out.println("\n--------");

        //设定临时交换变量
        int temp;

        for (int i = 0; i < (arr.length / 2); i++) {
            temp = arr[i];
            arr[i] = arr[(arr.length -1 - i)];
            arr[arr.length -1 - i] = temp;
        }
//打印输出新数组
        for (int j : arr) {
            System.out.print(j + "\t");
        }

    }
}
