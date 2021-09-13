package LoopLearn;

import java.util.Scanner;

public class SpecialistEvaluation {

    /*6个评委打分：
    * 去掉最高分
    * 去掉最低分
    * 其余4个评委的分数求平均分，忽略小数
    * */

    public static void main(String[] args) {
        int[] arr = new int[6];

        //获取每个评委的打分
        for (int i = 0 ; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个评委的打分:");
            arr[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("评委们的打分情况为：");
        printArray(arr);

        System.out.println("最终成绩为："+getAverageScore(arr));


    }
    public static void printArray(int[] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1){
                System.out.print("\t");
            }
        }
        System.out.print("]\n");
    }
    public static int getArrayMax(int[] arr) {
        int max = arr[0];

        for (int i = 1 ; i < arr.length ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    public static int getArrayMin(int[] arr) {
        int min = arr[0];

        for (int i = 1 ; i < arr.length ; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
    public static int getAverageScore(int[] arr) {
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        return (sum-getArrayMax(arr)-getArrayMin(arr))/4;
    }
}
