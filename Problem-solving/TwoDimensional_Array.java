
import java.util.*;
public class TwoDimensional_Array {
    public static void main(String [] args) {
      
        System.out.println("Enter rows and columns of array :");
        Scanner sc =new Scanner(System.in);
        int rows=sc.nextInt();
        int cols= sc.nextInt();
        int arr[][]=new int[rows][cols];
        
        //input values
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
    
        }

        //output Values
        System.out.println(" A 2D Array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
