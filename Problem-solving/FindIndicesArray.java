import java.util.Scanner;

public class FindIndicesArray {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the rows and columns of an Array:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        //Array
        int [][]arr=new int[rows][cols];
        //Enter Array Values
        System.out.println("Enter Array Values");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        // show 2D Array
        System.out.println("A 2D array");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

// find Indices of value x
        System.out.println("Enter no. to find indices");
        int x=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==x){
                    System.out.println("Indices of value "+x+" are "+i+j);
                }
            }       }


        sc.close();
    }
}
