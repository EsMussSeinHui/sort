package distributionSort;

public class bucketSort {
    public static int[] bucketSort(int[] array) {
        int max = array[0];
        for (int i : array) {
            max = i > max ? i : max;
        }

        int[] arr = new int[max + 1];
        for (int i : array)
            arr[i]++;
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {2, 23, 3, 1, 3, 4, 5};
        int[] arr = bucketSort(array);
        int x = 0;
        for (int i : arr
        ) {
            while (i-- > 0)
                System.out.println(x);
            x++;
        }
    }
}
