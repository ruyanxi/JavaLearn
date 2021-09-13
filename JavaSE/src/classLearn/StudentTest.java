package classLearn;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println("-------");

        s.setName("李华");
        s.setAge(19);

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println("-------");

        s.study();
        s.work();
    }


}
