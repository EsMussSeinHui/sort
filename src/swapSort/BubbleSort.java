package swapSort;

public class BubbleSort {
    private static void BubbleSort(int  [] array){
        int n=array.length;
        int i=0;
        int j=0;
        for (i=0;i<n;i++)
        {
            for (j=0;j<n-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 0,2,1,-1,-3};
        BubbleSort(array);
        for (int i : array
        ) {
            System.out.println(i);
        }
//        System.out.println(array);
    }
}
