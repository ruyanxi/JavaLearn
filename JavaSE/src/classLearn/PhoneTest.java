package classLearn;

public class PhoneTest {
    public static void main(String[] args) {
        phone p = new phone();

        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println("----------");

        p.brand="小米";
        p.price=2999;

        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println("----------");

        p.call();
        p.sengMessage();
    }
}
