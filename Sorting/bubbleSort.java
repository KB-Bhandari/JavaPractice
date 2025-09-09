package Sorting;

public class bubbleSort {

    public static void main(String[] args) {
        
        int arr[]={7,1,3,2,8,9,56,34,4};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }

                System.out.print(arr[j]+" ");
            
            }
            System.out.println();


        }
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
    
}
