public class CountPair{
    void pair(int arr[] ,int k, int count)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    count++;
                }
            }
        }
        System.out.println("No. of pairs whose sum is equal to "+k+" is "+count);
    }

    public static void main(String args[])
    {

        int arr[]={1,2,3,4,5,9};
        int k=10;
        int count=0;
        CountPair obj=new CountPair();
        obj.pair(arr,k,count);
    }
}