package InsertSort;

public class ShellSort {
    public static void shellsort(int [] array){
        int gap= array.length;
        int i,j;
        for(gap=gap/3+1;gap>1;gap=gap/3+1){
            for(i=0;i<gap;i++){ //因为gap 分为不同的组 ，所以组数 数量 为gap 组

                //下面才是直接插入排序，上面的i,只是表示要执行多少次插入排序
                for(j=i+gap;j<array.length;j+=gap){
                    int temp=array[j];
                    int k=j-gap;
                    if(array[k]>array[j]){
                        for(;k>=0&&array[k]>temp;k-=gap){
                            array[k+gap]=array[k];
                        }
                        array[k+gap]=temp;
                    }
                }
            }
        }
    }
    public static void main(String [] args){
        int [] array={12,2,1,1,3,31,4,5,6};
        shellsort(array);
        for (int i:array
             ) {
           System.out.println(i);
        }
    }
}



//gap 间隔