package ArrayLearn;

public class ArrayComparison {
    /*对比两个数组的元素是否相同，不要求数组元素顺序也相同。
     *
     * */
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {55, 22, 11, 33, 44};
        System.out.println(arrayComparison(arr1, arr2));
    }

    public static boolean arrayComparison(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        int i = 0;
        for (int x = 0; x < arr1.length; x++) {
            for (int y = 0; y < arr2.length; y++) {
                if (arr1[x] == arr2[y]) {
                    System.out.println(x+" "+y);
                    i++;
                }
            }

        }
        if (i != arr1.length){
            return false;
        } else {
            return true;
        }

    }
}
