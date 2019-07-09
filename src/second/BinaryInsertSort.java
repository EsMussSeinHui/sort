package second;

public class BinaryInsertSort {
    public static void BinaryInsertSort(int [] array){
        for (int i=1;i<array.length;i++){
            int low=0;
            int high=array.length-1;
            int temp = array[i];
            while(low<=high){
                int mid = (low + high) / 2;
                if(temp<array[mid]){
                    high=mid-1;
                }
                else
                    low=mid+1;
            }
            for (int j=i;j>low;j--)
                array[j]=array[j-1];
            array[low]=temp;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 0};
        BinaryInsertSort(array);
        for (int i : array
        ) {
            System.out.println(i);
        }
        System.out.println(array);
    }
}
