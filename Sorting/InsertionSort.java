package Sorting;

public class InsertionSort{
    public static void main(String[] args) {
        
        int key,j,i;
        int arr[]={2,5,4,7,8,99,1};
        for(j=1;j<arr.length;j++){
            key=arr[j];
            i=j-1;

            while(i>=0 && arr[i]>key){
                arr[i+1]=arr[i];
                i=i-1;
            }

            arr[i+1]=key;
             System.out.print(arr[j]+ " ");

        }

        for(i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
        }
    }
}