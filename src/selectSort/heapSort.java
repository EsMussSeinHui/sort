package selectSort;

public class heapSort {
    public static void maxHeapDown(int[] array, int start, int end) {
        int c = start;
        int left = 2 * c + 1;
        int tmp = array[c];
        //left 是变量
        for (; left <= end; c = left, left = 2 * left + 1) {
            if (left < end && array[left] < array[left + 1])
                left++;
            if (tmp >= array[left])
                break;
            else {
                array[c] = array[left];
                array[left] = tmp;
            }
        }
    }

    public static void heapSortAsc(int[] array) {
        int i, tmp, n = array.length;
        for (i = n / 2 - 1; i >= 0; i--) {
            maxHeapDown(array, i, n - 1);
        }
        for (i = n - 1; i > 0; i--) {
            tmp=array[0];
            array[0]=array[i];
            array[i]=tmp;
            maxHeapDown(array,0,i-1);
        }
    }


    public static void main(String[] args) {
        int i;
        int a[] = {20,30,90,40,70,110,60,10,100,50,80};
        System.out.printf("before sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
        heapSortAsc(a);            // 升序排列
        //heapSortDesc(a, a.length);        // 降序排列

        System.out.printf("after  sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
    }


}