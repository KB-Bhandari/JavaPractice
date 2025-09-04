package patterns;

public class InvertedLadder {
    
    public static void main (String args[]){
        int n=5;
        for(int i=0;i<5;i++){
            for(int j=n;j>0;j--){
                System.out.print("*");
            }
            n--;
            System.out.println();
        }

        //another method

        for(int i=5;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(" @ ");
            }
           
            System.out.println();
        }
    }
}
