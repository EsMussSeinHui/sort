package distributionSort;

public class radixSort {
    public static void main(String[] agrs) {
        int[] array = {2, 2, 5, 5, 8, 89, 9, 3, 3, 55};
        radixSort(array);
        for (int i: array
             ) {
            System.out.println(i);
        }
    }

    public static void radixSort(int[] array) {
        int max = findMax(array);
        System.out.println("max="+max);
        for (int i = 1; max / i > 0; i = i * 10) {   //外套循环为位数循环
            int[][] buckets = new int[array.length][10];

            //分配到桶子里 ，横向,放到指定位置当然不用双重循环
            for (int j = 0; j < array.length; j++) {
                int num = (array[j] / i) % 10;
                buckets[j][num] = array[j];
            }

            int k=0;
            //回收，是纵向的 ，遍历才能回收，总想回收只是为了区别大小
            for (int j = 0; j < 10; j++) {
                for (int x=0;x<array.length;x++){
                    if(buckets[x][j]!=0)
                        array[k++]=buckets[x][j];
                }
            }

        }
    }

    public static int findMax(int[] array) {
        int i = 0, j = array.length - 1;
        int max = array[0];
        while (i < j) {
            if (array[i] < array[j])
                i++;
            else
                j--;
        }
        return array[j];
    }
}

