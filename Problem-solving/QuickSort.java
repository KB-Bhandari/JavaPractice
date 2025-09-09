public class QuickSort{
    void partition(int arr[], int start,int end,int len)
    {    
         int k=end;
         int pivot=arr[start];
         for(int i=end;i>start;i--)
         {
            if(arr[i]>pivot)
            {
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
            }
            k--;
             System.out.print(" "+arr[i]);
             
         }
         System.out.println(" ");
         int temp=arr[start];
                arr[start]=arr[k];
                arr[k]=temp;
        for(int i=0;i<arr.length;i++)
        {
             System.out.print(" "+arr[i]);
        }

    }

    public static void main(String args[])
    {
        int arr[]={4,1,3,7,2,9,2};
        int len=arr.length;
        int mid=0;
        int start=0;
        int end=len-1;
        QuickSort obj=new QuickSort();
        obj.partition(arr,start,end,len);
    }
}