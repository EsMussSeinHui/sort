package second;

public class StraightInsertSort {
    public  static void insertSort(int array[]){
        int i,j,k;
        for (i=1;i<array.length;i++)
        {
            int temp=array[i];
            k=i-1;
            if(array[k]>array[i]){
                for (j=k;j>=0&&array[j]>temp;j--){
                    array[j+1]=array[j];
                    k--;
                }
                array[k+1]=temp;
            }
        }
    }

    public static void main(String [] args)
    {
        int [] array={2,2,5,8,3,1,8,4,5,3};
        insertSort(array);
        for (int i:array
             ) {
            System.out.println(i);
        }
        System.out.println(array);
    }

}
