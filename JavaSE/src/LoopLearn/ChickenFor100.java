package LoopLearn;

public class ChickenFor100 {
    /*
     * 取题于《算经》（张丘建）
     * 鸡翁一值钱五
     * 鸡母一值钱三
     * 鸡雏一值钱一
     * 百钱买百鸡，问各自几何？
     * */


    public static void main(String[] args) {
        int money = 100;
        int w, m, c;

        for (w = 0; w <= 20; w++) {
            for (m = 0; m <= 33; m++) {
                c = 100 - w - m;
                if (5 * w + 3 * m + c / 3 == 100 && c % 3 == 0) {
                    System.out.println("共有鸡翁：" + w + " ,鸡母：" + m + " ,鸡雏：" + c);

                }
            }
        }
    }
}
