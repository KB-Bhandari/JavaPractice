//import java.util.*;;
public class KadaneAlgo {

     static int kadane(int arr[])
    {
        int max_end=0;
        int max_so_far=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            max_end=max_end+arr[i];
            if(max_so_far<max_end)
            
                max_so_far=max_end;
               // System.out.println(max_so_far);
            
            if(max_end<0)
            
                max_end=0;
            

        }
        return max_so_far;
        //System.out.println(max_so_far);
    }
    public static void main(String args[])
    {
        int arr[]={-2,1,3,-4,5};
        //int max_so_far=arr[0];
       // KadaneAlgo obj=new KadaneAlgo();
        //obj.
        //kadane(arr);
        System.out.println("maximum sum :"+kadane(arr));
       // System.out.println(Integer.MIN_VALUE);

        



    }
    
}
