import java.util.*;

public class AleternatePosition{
    ArrayList<Integer> arrlist1=new ArrayList<Integer>();
    ArrayList<Integer> arrlist2=new ArrayList<Integer>();
    ArrayList<Integer> arrlist3=new ArrayList<Integer>();

    void positioningAlt(int arr[])
       {
            for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                arrlist1.add(arr[i]);
               
               
            }
            
        }
                  System.out.println(arrlist1);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                arrlist2.add(arr[i]);
                
            
            }

        }
        System.out.println(arrlist2);
        Integer[] arr1=new Integer[arrlist1.size()];

        for(int i=0;i<arrlist1.size();i++)
        {
            arr1=arrlist1.toArray(arr1);
              System.out.print(arr1[i]);         

        }
         Integer[] arr2=new Integer[arrlist2.size()];

        for(int i=0;i<arrlist2.size();i++)
        {
            arr2=arrlist2.toArray(arr2);
              System.out.print(arr2[i]);         

        }
       int arr3[]=new int[arr.length];
       int i;
       for( i=0;i<arr.length;i++)
       {
            arr3[i]=arr1[i];
           
            arr3[i+1]=arr2[i];
            
             i++;       


       }
        System.out.print(arr3[i]);  
         
       }
       
    public static void main(String args[])
    {
        int arr[]={1,-2,4,2,3,-1,-4};
       // Integer arr1[]=new Integer[n];
        AleternatePosition obj=new AleternatePosition();
        obj.positioningAlt(arr);
    } 
}