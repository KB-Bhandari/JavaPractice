import java.util.*;

public class CommonElement{

    ArrayList<Integer> arrlist1=new ArrayList<Integer>();
     ArrayList<Integer> arrlist2=new ArrayList<Integer>();
      ArrayList<Integer> arrlist3=new ArrayList<Integer>();
    
    void findCommonEl(int arr1[], int arr2[], int arr3[])
    {
       for(int i=0;i<arr1.length;i++)
       {
        // if(!arrlist1.contains(arr1[i])){
                 arrlist1.add(arr1[i]);
        // }
       
       }
       System.out.println(arrlist1);
       

       for(int i=0;i<arr2.length;i++)
       {
       // if(!arrlist2.contains(arr2[i])){
                 arrlist2.add(arr2[i]);
       
     //  }
       }
       System.out.println(arrlist2);
       System.out.println("Common elements of given 3 arrays are: ");

       for(int i=0;i<arr3.length;i++)
       {
        if(arrlist1.contains(arr3[i])&&arrlist2.contains(arr3[i]))
        {
            if(!arrlist3.contains(arr3[i])){
                 arrlist3.add(arr3[i]);
           // arrlist3.add(arr3[i]);
            //System.out.print(arr3[i]);
        }
       }
       }
        System.out.print(arrlist3);
        
    }
    public static void main(String args[])
    {
        int arr1[]={1,2,3,4,2,8,9};
        int arr2[]={1,3,2,4,5,2};
        int arr3[]={2,3,5,2,0,9,6};
        CommonElement obj=new CommonElement();
        obj.findCommonEl(arr1,arr2,arr3);
    }
}