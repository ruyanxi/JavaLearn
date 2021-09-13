package APILearn;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: AutomaticPackingAndUnpackingLearn
 * @ProjectName: java-se-learning
 * @Description：
 * 自动拆箱和装箱的测试类
 * @date： 2021/8/30 16:10
 */
public class AutomaticPackingAndUnpackingLearn {
    public static void main(String[] args) {
        //装箱，把基本数据类型装换为对应的包装类类型

        //装箱
        Integer i = Integer.valueOf(100);
        //自动装箱
        Integer ii = Integer.valueOf(100);

        //拆箱：把包装类类型装换为对应的基本数据类型

        //拆箱
        int i1 = ii.intValue() + 200;
        //自动拆箱
        int i2 = ii + 200;

        //自动拆箱后又自动装箱（等同于：ii = Integer.valueOf(ii.intValue() + 200);）
        ii += 200;

        /*
         * 空指针异常NullPointerException
         *
         * Integer iii = null;
         * iii  += 300;
         * 运行报错，因为iii += 300;等同于iii = Integer.valueOf(iii.intValue() + 300);
         * 而iii=null，iii.intValue()就等于null.intValue()，故报错
         *
         * 因此需要判断iii != null
         * Integer iii = null;
         * if (iii != null){
         *     iii  += 300;
         * }
         *
         * 即实际开发中如果是引用类型最好判断是否为null
         */
    }
}
