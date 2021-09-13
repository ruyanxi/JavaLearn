package APILearn.Object;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: ObjectLearn
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/27 11:23
 */
public class ObjectLearn {
    public static void main(String[] args) {
        people p1 = new people("Rob",20);

        System.out.println(p1);
        System.out.println("------------------");
        System.out.println(p1.toString());

        people p2 = new people("Taylor",26);
        System.out.println(p2);

//        //这里对比的是地址值，所以一直是false
//        System.out.println(p1 == p2);

        people p3 = new people("Rob",20);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

    }
}
