package Recursion;

public class Factorial {
    
   public static void fact(int i, int num ,int n){
     if(i==n){
        num*=i;
        System.out.println(num);
        return;

    }

    num*=i;
    System.out.println(num);
    fact(i+1, num,n);

   }



   public static int fact2( int n){
    if(n==1||n==0){
        return 1;
    }
    int factVal=fact2(n-1);
    int val=factVal*n;
    return val;

   }
    public static void main(String[] args) {

        int n=5;
        int result=fact2(n);
        System.out.println(result);
    }
}
