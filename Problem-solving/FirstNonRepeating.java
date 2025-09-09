
import java.util.*;
public class FirstNonRepeating{
    int n,i;
    void firstNonRep(int arr[])
        {
            ArrayList<Integer> arrList=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arrList.add(arr[i]);
                           
                }
               // System.out.println(arrList);
                
            }
            
        }
        System.out.print("First Non-Repeating Element is ");
        for(int i=0;i<arr.length;i++)
        {
            if(!arrList.contains(arr[i]))
            {
                System.out.print(arr[i]);
                break;
                
            }
             
        }
       
    }

    public static void main(String args[])
    {
        int arr[]={1,2,3,3,9,2,4,5,6,1};
        FirstNonRepeating obj=new FirstNonRepeating();
        obj.firstNonRep(arr);
    }
    
    }
    //has to done