public class SubarrayWith0
{
   static boolean subarrayFun(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int sum=arr[i];
            if(sum==0)
            {
               // System.out.println("done");
               return true;
              
            }
            else 
            {

            for(int j=i+1;j<arr.length;j++)
                {
                    sum=+arr[j];
                    
                    if(sum==0)
                    {
                        //System.out.println("done 0");
                        return true;
                    
                    }
                    
                }
            }
    }  
      //System.out.println("no");
      return false;
        
    }

    public static void main(String[] args) {
        int arr[]={1,3,2,9,5};
       // SubarrayWith0 obj=new SubarrayWith0();
       // obj.subarrayFun(arr);
       // System.out.println("jjjj");
       
       if(subarrayFun(arr))
       {
        System.out.println("found");
       }
       else{
        System.out.println("not found");
       }
       
    }
}