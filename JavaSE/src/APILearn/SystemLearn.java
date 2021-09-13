package APILearn;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: SystemLearn
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/27 10:58
 */
public class SystemLearn {
    public static void main(String[] args) {
        //|public static void exit(int status)|---------->终止当前运行的Java虚拟机，非零表示异常终止|
        System.out.println("beginning");

//        System.exit(0);
        System.out.println("ending");


        System.out.println("-----------------");
        //|public static long currentTimeMillis()|---------->返回当前时间（以毫秒为单位）|
        System.out.println(System.currentTimeMillis());
        System.out.println("-----------------");

        long start = System.currentTimeMillis();
        for (int i = 0;i < 10000;i++){
            System.out.println(i);
        }
        long end  = System.currentTimeMillis();

        System.out.println("共耗时："+(end-start)+"毫秒");
    }
}
