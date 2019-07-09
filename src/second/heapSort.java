package second;

public class heapSort {

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

    private static void heapSortAsc(int[] array) {
        int i;
        int n=array.length;
        for (i=n/2-1;i>=0;i--)
            maxheapDown(array,i,n-1);

        for (i=n-1;i>0;i--){
            int tmp=array[0];
            array[0]=array[i];
            array[i]=tmp;
            maxheapDown(array,0,i-1);
        }
    }

    private static void  maxheapDown(int[] array,int start,int end){    //start 理解为 node 节点更好。
        int c=start;                                                    //调整某个节点在适当分支
        int left=2*c+1;                                                 //这样0，i-1 参数更加容易理解
        int tmp=array[c];
        for (;left<=end;c=left,left=2*left+1){
            if (left<end&&array[left]<array[left+1])   //left<end  必须放在前面
            {
                left++; //选择大的往上面替换。
            }
            if(tmp>=array[left])
                break;
            else {
                array[c]=array[left];
                array[left]=tmp; // 疑问二，tmp一直不变
            }
        }
    }

}


//参数特殊 maxheapDown   int start  和  int  end 不能少一个
//作用， statt在第一次循环时，作为节点，去便利。而end 第二步排序时，end的数值实际上是在减小的
//疑问一   为什么，需要循环下去，如果这个是从地往上，不就是应该..
// 懂了。一开始是无序的，
