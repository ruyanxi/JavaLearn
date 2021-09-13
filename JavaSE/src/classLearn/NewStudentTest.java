package classLearn;

public class NewStudentTest {
    public static void main(String[] args) {
        NewStudent newS1 = new NewStudent();
        newS1.setName("Rob");
        newS1.setAge(20);

        newS1.show();

        NewStudent newS2 = new NewStudent("Troye",26);

        newS2.show();
    }
}
