package Sorting;

public class MergeSort{

    public static void  divide(int arr[], int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conquer(arr, start, mid, end);
    }

    public static void conquer(int arr[],int start,int mid, int end)
    {
       int merger[]=new int[end-start+1];
       
        //subArrayIndices
        int arr1_idx=start;
        int arr2_idx=mid+1;

        //merge array Index
        int mergeIdx=0;

        while(arr1_idx<=mid && arr2_idx<= end){
            if(arr[arr1_idx] <= arr[arr2_idx]){
                merger[mergeIdx++]=arr[arr1_idx++];
            }
            else{
                merger[mergeIdx++]=arr[arr2_idx++];
            }
        }

        while(arr1_idx<= mid){
            merger[mergeIdx++]=arr[arr1_idx++];
        }
        while(arr2_idx<=end){
            merger[mergeIdx++]=arr[arr2_idx++];
        }

        for(int i=0 ,j=start; i<merger.length; i++ ,j++){
            arr[j]=merger[i];
        }

    }
    public static void main(String[] args) {
        int arr[]={3,5,2,6,9,8};
        int n=arr.length;
        divide(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}



