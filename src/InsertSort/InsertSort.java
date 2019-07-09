package InsertSort;

/**
 * 直接插入排序：Java
 *
 * @author skywang
 * @date 2014/03/11
 */

public class InsertSort {

    /*
     * 直接插入排序
     *
     * 参数说明：
     *     a -- 待排序的数组
     *     n -- 数组的长度
     */
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                int temp = array[i];
                int k = i - 1;
                for (; k >= 0 && array[k] > temp; k--) {
                       array[k+1]=array[k];
                }
                array[k+1]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int i;
        int[] a = {1,2,3};

        System.out.printf("before sort:");
        for (i = 0; i < a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");

        insertSort(a);

        System.out.printf("after  sort:");
        for (i = 0; i < a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
    }
}