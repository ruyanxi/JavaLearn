package InheritLearn.demo1;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Student
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/25 9:34
 */
public class Student extends People{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void study(){
        System.out.println(this.getName()+","+this.getAge()+" "+"study....");
    }
}
