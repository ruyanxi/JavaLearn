package ArrayListLearn;

import java.util.ArrayList;

/**
 * @author:朢曐(雷杨一凡)
 * @Title:ArrayListDemo
 * @ProjectName:java-se-learning
 * @Description：    1.ArrayList构造方法和添加方法
 *              public ArrayLIst()  创建一个空的集合对象
 *
 *              public boolean add(E e) 将指定元素追加到此集合的末尾
 *              public void add(int index,E element)    在此集合中的指定位置插入指定元素
 *                  2.ArrayList集合常用方法
 *              publi boolen remove(Object o)   删除指定的元素，返回删除是否成功
 *              pulic E remove(int index)   删除指定索引处的元素，返回被删除的元素
 *              public E set(int index,E element)   修改指定索引处的元素，返回被修改的元素
 *              public E get(int index)    返回指定索引处的元素
 *              public int size()   返回集合中的元素的个数
 * @date：2021/8/23 19:20
 */
public class ArrayListDemo {
    public static void main(String[] args) {
//        public ArrayLIst()  创建一个空的集合对象
//        ArrayList<String> array = new ArrayList<>();  //等同于下方语句：
        ArrayList<String> array = new ArrayList<String>();

        //public boolean add(E e) 将指定元素追加到此集合的末尾
//        System.out.println(array.add("hello")); //得到true
        array.add("Hello");
        array.add("New");
        array.add("World");

        //public void add(int index,E element)    在此集合中的指定位置插入指定元素
//        array.add(1,"JavaSE");
//        array.add(3,"JavaEE");

        //warn!IndexOutOfBoundsException--集合索引越界异常
//        array.add(4,"JavaME");

//        publi boolen remove(Object o)   删除指定的元素，返回删除是否成功
//        System.out.println(array.remove("World"));
//        System.out.println(array.remove("JavaEE"));

//        pulic E remove(int index)   删除指定索引处的元素，返回被删除的元素
//        System.out.println(array.remove(1));

        //warn!IndexOutOfBoundsException--集合索引越界异常
//        System.out.println(array.remove(4));

//        public E set(int index,E element)   修改指定索引处的元素，返回被修改的元素
//        System.out.println(array.set(1,"JavaEE"));

        //warn!IndexOutOfBoundsException--集合索引越界异常
//        System.out.println(array.set(4,"JavaME"));

//        public E get(int index)    返回指定索引处的元素
//        System.out.println(array.get(0));
//        System.out.println(array.get(1));
//        System.out.println(array.get(2));

        //warn!IndexOutOfBoundsException--集合索引越界异常
//        System.out.println(array.get(3));

//        public int size()   返回集合中的元素的个数
        System.out.println(array.size());
        //输出集合
        System.out.println("array:"+ array);

    }
}
