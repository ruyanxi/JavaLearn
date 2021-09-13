package ArrayLearn;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] arr[] = new int[3][2];

        System.out.println(arr);

        System.out.println("-------");
        System.out.println(arr[0]);
        arr[0][0] = 15;
        System.out.println(arr[0][0]+"arr 0 0");

    }
}
