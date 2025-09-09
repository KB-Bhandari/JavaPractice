package Sorting;

public class QuickSort{


    public static int partition(int arr[],int low, int high){
        int pivot= arr[high];  // pivot element
        int i=low-1; //inidicate the right position of pivot element found so far

        for(int j=low;j<arr.length;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;

    }

    public static void swap(int arr[],int i, int j ){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    public static void quickSort(int arr[], int low, int high ){
        if(low<high){
            int pi=partition(arr,low,high);

            quickSort(arr,low,pi-1);

            quickSort(arr,pi+1,high);
        }
    }
    public static void main(String args[]){
        int arr[]={4,6,2,9,5,8,1,3,11};
        int n=arr.length;
        quickSort(arr, 0, n-1);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
