package ArrayLearn;

import java.util.Scanner;

public class RabbitArray {
    /*
     * 兔子在不死的前提下，从第三个月开始每个月生一对小兔子，求第二十个月的兔子数
     * 1：->1
     * 2：->1
     * 3：->2
     * 4：->3
     * 5：->5
     * ... ...
     * n：->(n-1)+(n-2)  [n>=3]
     * */


    public static void main(String[] args) {
        //使用数组模拟
        System.out.println("请输入待求的月数：");
        int n=new Scanner(System.in).nextInt();

        long[] rabbit = new long[n];
        if (n<=2) {
            System.out.println("第"+n+"个月的兔子数为：1对");
        }else {
            //定义初始值rabbit[1]和rabbit[0]
            rabbit[0] = 1;
            rabbit[1] = 1;

            for (int i = 2; i < rabbit.length; i++) {
                rabbit[i] = rabbit[i - 1] + rabbit[i - 2];
            }
            System.out.println("第"+n+"个月的兔子数为：" + rabbit[rabbit.length-1]+" 对。");
        }}

}
