package patterns;

public class RightSideLadder {
    
    public static void main(String[] args) {
        int k,j,i;
        int n=5;
        for( k=1;k<n;k++){
            for( i=1;i<n-k;i++){
                System.out.print(" ");
                
             
            }
            for( j=1;j<=k;j++){
                    System.out.print("*");
                }
             System.out.println();
        }
    }
}
