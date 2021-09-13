package StringLearn;

/**
 * @author Administrator
 */
public class StringConvert {
    public static void main(String[] args) {
        //使用方法将int数组返回为字符串并输出控制台

        //初始化一个数组
        int[] arr = { 1, 2, 3};

        //调用方法完成期望转换
        String str = ArrayToString(arr);

        System.out.println(str);

    }
    public static String ArrayToString(int[] arr) {
        String str = "";

        str += "[";
        for (int i =0; i< arr.length;i++) {
            str += arr[i];
            if (i < arr.length-1){
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
}
