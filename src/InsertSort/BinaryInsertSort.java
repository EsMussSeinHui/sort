package InsertSort;

public class BinaryInsertSort {
    public static void BinaryinsertSort(int array[]) {
//        int i, j, k;
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int low = 0;
            int high = i - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (temp < array[mid]) {
                    high = mid - 1;
                } else
                    low = mid + 1;
            }
                for (int j = i; j >= low + 1; j--)
                    array[j] = array[j - 1];
                array[low] = temp;
            }
        }



    public static void main(String[] args) {
        int[] array = {0,1, 1,2, 3,0, 0};
        BinaryinsertSort(array);
        for (int i : array
        ) {
            System.out.println(i);
        }
        System.out.println(array);
    }
}
