
package Recursion;
import java.util.Scanner;
public class Counting {
    
    public void printNum(int n, int m ){
        if(n>m){
            return;
        }
        
        System.out.print(n+" ");
        printNum(n+1,m);
    }

    public void backCount(int m, int n){
        if(m<n){
            return;
        }

        System.out.print(m+" ");
        backCount(m-1, n);
    }
    public static void main(String[] args) {

        Counting ob =new Counting();
        System.out.println("Enter number from where to print and upto :");

        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        System.out.println("The counting are : ");
        ob.printNum(n,m);
        System.out.println();
        System.out.println("Back Counting :");
        ob.backCount(m, n);
        sc.close();


   }
}
