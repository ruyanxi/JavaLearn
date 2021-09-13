package ArrayLearn;

public class ArrayComparison2 {
    /*数组元素对比，要求元素值和元素顺序均相同
    * */
    public static void main(String[] args) {
        int[] arr1 = {11,22,33,44,55};
        int[] arr2 = {11,22,33,44,55};
        System.out.println(ArrayComparsion(arr1,arr2));
    }

    public static boolean ArrayComparsion (int[] arr1,int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int x =0;x < arr1.length;x++) {
            if (arr1[x] != arr2[x]) {
                return false;
            }
        }
        return true;
    }
}
