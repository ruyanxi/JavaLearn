package ArrayLearn;

public class ArraySum {
    /*
     * 求数组条件元素和，要求元素十位不为7，个位不为7，且为偶数；
     * 根据题目设置条件为：
     * 1.int[n] % 10 != 7
     * 2.int[n] / 10 % 10 != 7
     * 3.int[n] % 2 == 0
     * */
    public static void main(String[] args) {
        //导入题目设数组值：
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        //设置变量统计和
        int sum = 0;

        for (int n = 0; n <= arr.length - 1; n++) {
            if (arr[n] % 10 != 7 && arr[n] / 10 % 10 != 7 && arr[n] % 2 == 0) {
                sum += arr[n];
                System.out.print(arr[n] + "\t");
            }
        }
        System.out.println("\n数组和为：" + sum);
    }
}
