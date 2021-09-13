package ArrayListLearn;

import classLearn.Student;

import java.util.ArrayList;

/**
 * @author:朢曐(雷杨一凡)
 * @Title:ArrayListTracersalToStudent
 * @ProjectName:java-se-learning
 * @Description：
 * @date：2021/8/24 9:03
 */
public class ArrayListTracersalToStudent {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> arrayStudent = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("张三",21);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",23);

        //添加学生对象到集合中
        arrayStudent.add(s1);
        arrayStudent.add(s2);
        arrayStudent.add(s3);

        //遍历集合，使用通用遍历格式
        for (int i = 0 ; i< arrayStudent.size();i++){
            Student s = arrayStudent.get(i);
            System.out.println(s.getName()+", "+s.getAge());
        }
    }
}
