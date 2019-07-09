package selectSort;

public class selectSort {
    public static void selectSort(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length-1; i++) {
            min = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[min])
                    min=j;
            }
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 2, 1, 1, 3, 31, 4, 5, 6};
        selectSort(array);
        for (int i : array
        ) {
            System.out.println(i);
        }
    }
}
