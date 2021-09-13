package ArrayListLearn;

import classLearn.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author:朢曐(雷杨一凡)
 * @Title:ArrayListTTSupdate
 * @ProjectName:java-se-learning
 * @Description：
 * @date：2021/8/24 9:12
 */
public class ArrayListTracersalToStudentUpdate {
    public static void main(String[] args) {
        //创建数组对象
        ArrayList<Student> array = new ArrayList<Student>();

        //使用方法获取信息
        addStudent(array);


        //打印遍历
        printStudent(array);
    }

    public static void addStudent(ArrayList<Student> array){
        //提示并获取学生数量
        System.out.println("请输入待输入的学生数量：");
        int num = new Scanner(System.in).nextInt();

        System.out.println("-------------------------------");
        for (int i = 1; i <= num; i++) {
            System.out.println("--------获取第" + i + "个学生的信息:-------");
            System.out.print("姓名：");
            String name = new Scanner(System.in).nextLine();
            System.out.print("年龄：");
            int age = new Scanner(System.in).nextInt();
            Student S = new Student(name, age);
            array.add(S);

        }
    }

    public static void printStudent(ArrayList<Student> array) {
        //遍历集合，使用通用遍历格式
        System.out.println("---------打印遍历学生信息----------");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.print("第"+(i+1)+"个学生：");
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }
}
