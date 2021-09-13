package APILearn;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: BubbleSortLearn
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/27 12:00
 */
public class BubbleSortLearn {
    public static void main(String[] args) {
        int[] arr = {124, 235, 2345, 345234, 5345, 6};

        System.out.println(arrayToString(arr));
        System.out.println("--------------------");
        System.out.println(arrayToString(bubbleSort(arr)));

    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
