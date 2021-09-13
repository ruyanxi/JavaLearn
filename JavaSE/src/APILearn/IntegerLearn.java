package APILearn;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: IntegerLearn
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/27 14:43
 */
public class IntegerLearn {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        System.out.println(i1);

        Integer i2 = new Integer("123");
        System.out.println(i2);

/*        //NumberFormatException
        Integer i3 = new Integer("abc");
        System.out.println(i3);*/


        /*等同于直接赋值：Integer i4 = 100;*/
        Integer i4 = Integer.valueOf(100);
        System.out.println(i4);

        Integer i5 = Integer.valueOf("100");
        System.out.println(i5);

/*        //NumberFormatException
        Integer i6 = Integer.valueOf("abc");
        System.out.println(i6);*/

//        int To String
        int num = 100;
        //方式1
        String s1 = ""+ num;
        System.out.println(s1);
        //方式2
        String s2 = String.valueOf(num);
        System.out.println(s2);

        System.out.println("-----------");

//        String To int
        String str = "100";
        //方式1 = String -> Integer -> int
        Integer integer = Integer.valueOf(str);
        //public int intValue()
        int i = integer.intValue();
        System.out.println(i);
        //方式2
        //public static int arseInt (String s)
        int x = Integer.parseInt(str);

        System.out.println(x);



    }
}