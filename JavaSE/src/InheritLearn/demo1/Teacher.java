package InheritLearn.demo1;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Teacher
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/25 9:36
 */
public class Teacher extends People{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach(){
        System.out.println(this.getName()+","+this.getAge()+" "+"teaching....");
    }
}
