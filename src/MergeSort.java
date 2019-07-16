public class MergeSort {
    public static void main(String [] args)
    {
        int [] array={11,2,3,4,55,22,33,2};
//        int  []left= new int [3];
//        System.arraycopy(array,1,left,0,left.length);
//        for (int i:
//             left) {
//            System.out.println(i);
//        }
        merge(array,0,array.length-1);
        for (int i: array
             ) {
            System.out.println(i);
        }
    }

    private static void merge(int[] array, int l, int r){
        if(l==r)
            return ;
        int mid=(l+r)/2;
        merge(array,l,mid);
        merge(array,mid+1,r);
        mergeSort(array,l,mid+1,r);
    }

    private static void mergeSort(int[] array, int l, int mid, int r) {
        int  [] left=new int [mid-l];
        int []right=new int [r-mid+1];
        System.arraycopy(array,l,left,0,left.length);
        System.arraycopy(array,mid,right,0,right.length);

        int i=0,j=0;
        int post=l;
        while(i<left.length&&j<right.length){
            if(left[i]<right[j])
                array[post]=left[i++];
            else
                array[post]=right[j++];
            post++;
        }

        for (;i<left.length;i++)
                array[post++]=left[i];
        for (;j<right.length;j++)
            array[post++]=right[j];
    }
}
