public class IntegerMissing{
    void numMissing(int arr[], int temp)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(" "+
            arr[i]);
        }
        System.out.println("");
        System.out.print("Missing no. is ");
        for(int i=0;i<arr.length-1;i++)
        {
            int num=arr[i];
            int num2=arr[i+1];
            if(num!=num2-1)
            {
                System.out.println( num+1);
            }


                    }
    }

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,6,7};
        int temp=0;
        IntegerMissing obj=new IntegerMissing();
        obj.numMissing(arr,temp);
    }
}