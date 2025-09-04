package Recursion;

public class SumNaturalNumber {
    

    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println("The sum of first "+n+" Natural number is: "+sum);
            return;
        }

        System.out.println(i);
        sum+=i;

        printSum(i+1, n, sum);
        System.out.println(i);
    }

    public static void main(String[] args) {


        printSum(1, 5, 0);
    }
    
}
