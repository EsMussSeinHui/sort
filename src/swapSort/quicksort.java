package swapSort;

public class quicksort {

    private static void quicksort(int[] array, int low, int high) {
        if (high <= low)
            return;   //终止条件

        int i, j, key;
        i = low;
        j = high+1 ;//搭配下面的--j 这样去理解，high 传入的数组坐标，一开始就是length-1
        key = array[low];
        while (true) {
            while (array[++i] < key) {
                if (i == high)
                    break;
            }
            while (array[--j] > key) {
                if (j == low)
                    break;
            }
            if (i >= j) break;

            swap(array, i, j);
        }

        swap(array, low, j);  //最后需要找到合理的key所在的位置
        quicksort(array,low,j-1);
        quicksort(array,j+1,high);
    }

    private static void swap(int[] array, int i, int j) {
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 0, 2, 1, -1, -3};
        quicksort(array, 0, array.length-1);
        for (int i : array
        ) {
            System.out.println(i);
        }
//        System.out.println(array);
    }
}
