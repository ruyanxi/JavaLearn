/**
 * @author:朢曐(雷杨一凡)
 * @Title:Student
 * @ProjectName:java-se-learning
 * @Description：
 * @date： 2021/8/24 10:20
 */
public class Student {
    private String sId;
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String sId, String name, int age, String address) {
        this.sId = sId;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
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
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
