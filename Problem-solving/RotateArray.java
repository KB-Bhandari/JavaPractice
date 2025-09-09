public class RotateArray{
    void rotate(int arr[], int len)

{

    System.out.print("Array: ");
    for(int i=0;i<len;i++)
    {
         System.out.print(" "+arr[i]);
    }

     int temp=arr[len-1];
        for(int i=len-1;i>0;i--)
        {
            arr[i]=arr[i-1];

           
        }
       arr[0]=temp;
        System.out.println(" ");
     System.out.print("Rotated Array: ");
    for(int i=0;i<len;i++)
    {
         System.out.print(" "+arr[i]);
    }



    }


    public static void main(String args[])
    {
        int arr[]={1,4,5,6,7,8};
        int len=arr.length;
        RotateArray obj=new RotateArray();
        obj.rotate(arr, len);
     
    }
}