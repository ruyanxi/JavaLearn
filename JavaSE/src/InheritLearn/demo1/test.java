package InheritLearn.demo1;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: test
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/25 9:40
 */
public class test {
    public static void main(String[] args) {
        //无参构造模式
        Teacher t1 = new Teacher();
        Student s1 = new Student();

        t1.setName("Robbin");
        t1.setAge(29);
        t1.teach();

        s1.setName("Rob");
        s1.setAge(20);
        s1.study();

        //带参构造方法
        System.out.println("-------------");
        Teacher t2 = new Teacher("Taylor",31);
        Student s2 = new Student("Troye",26);

        t2.teach();
        s2.study();
    }
}
