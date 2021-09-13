package StringLearn;

/**
 * @author:朢曐(雷杨一凡)
 * @Title:StringJoint
 * @ProjectName:java-se-learning
 * @Description：字符串拼接 V2.0
 * @date：2021/8/23 18:38
 */
public class StringJoint {
    public static void main(String[] args) {
        /*
         * 定义方法，使 int[] 中的数据按指定格式输出为字符串后返回，调用方法，最后输出结果
         */

        //初始化数组
        int[] arr = {1, 2, 3};

        //调用方法
        String str = Joint(arr);
        System.out.println("arr to String:" + str);
    }

    public static String Joint(int[] arr) {
        StringBuilder sb1 = new StringBuilder();

        sb1.append("[");

        for (int i = 0; i < arr.length; i++) {
            sb1.append(arr[i]);

            if (i < arr.length - 1) {
                sb1.append(", ");
            }
        }

        sb1.append("]");
        String str = sb1.toString();
        return str;
    }
}
