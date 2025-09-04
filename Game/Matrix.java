public class Matrix {
    public static boolean helper(char board [][],int row, int col){
        // base condition
        if(row==board.length){
            return true;
        }

        int nrow=0;
        int ncol=0;

        if(col!=board.length-1){
            nrow=row;
            ncol=col+1;
        }
        else{
            nrow=row+1;
            ncol=0;
        }

        if(board[row][col]!='.'){
            if(helper(board, nrow,ncol)){
                return true;
            }
        }
        else{
            for(int i=1;i<=9;i++){
               if( isSafe(board, row, col,i)){
                    board[row][col]=(char)(i+'0');
                        if(helper(board, nrow, ncol)){
                            return true;
                                }     
               
                        else{
                            board[row][col]=('.');
                        }
                 }                    
            }
            }
        return false;
   }

   public static  boolean isSafe(char[][] board, int row, int col, int num){
    char c= (char)(num+'0');
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==c){
                    return false;
                }


            // if(board[i][col]==(char)(num+'0')){
            //     return false;
            // }
            // if(board[row][i]==(char)(num+'0')){
            //     return false;
            // }
        }
        }
        return true;
            }


      // print Sudoku
      public  static void printMatrix(char [][] board)  {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
      }     
    
    public static void main(String args[]){
        char board[][]=new char[][]{
            {'.','.','8'},
            {'4','1','.'}, 
            {'6','.','2'}
        };

        if(helper(board,0,0)){
            System.out.println("The matrix filled from 1 to 9 :");
            printMatrix(board); 
        }
        else{
            System.out.println("No solution exists");
        }
    }
}
