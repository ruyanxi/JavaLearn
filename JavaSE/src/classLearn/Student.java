package classLearn;

public class Student {

    private String name;
    private int age;

    public Student(){}
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("输入年龄有误！");
        } else {
            this.age = age;
        }

    }


    public void study() {
        System.out.println("学习");
    }

    public void work() {
        System.out.println("做作业");
    }
}
