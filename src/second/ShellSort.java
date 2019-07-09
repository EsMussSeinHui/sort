package second;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = {12, 2, 1, 1, 3, 31, 4, 5, 6};
        shellsort(array);
        for (int i : array
        ) {
            System.out.println(i);
        }
    }

    private static void shellsort(int[] array) {
        int i = 0, j = 0;
        int n = array.length;
        int gap = array.length;
        for (gap = gap / 2; gap>0; gap /= 2) {
            for (i = 0; i < gap; i++) {

                for (j=i+gap; j < n ;j = j + gap){
                    int k=j-gap;
                    int tmp=array[j];
                    if (tmp<array[k]){
                        for (;k>=0&&array[k]>tmp;k-=gap){
                            array[k+gap]=array[k];
                        }
                    }
                    array[k+gap]=tmp;
                }
            }
        }
    }
}


// for(j=i+gap;j<array.length;j+=gap){
//        int temp=array[j];
//        int k=j-gap;
//        if(array[k]>array[j]){
//        for(;k>=0&&array[k]>temp;k-=gap){
//        array[k+gap]=array[k];
//        }
//        array[k+gap]=temp;
//        }
