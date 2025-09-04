package Recursion;

public class FirstAndLastOccurance {
   static int first=-1;
    static int last=-1;

    public static void recursion( String str, int index, char element){

        if(index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;

        }

        char currChar=str.charAt(index);
        if(currChar==element)
        {
            if(first==-1){
                first=index;
            }
            else
            last=index;
        }
        recursion(str,index+1, element);
    }

    public static void main(String args[]){
        
        String str="aabbcvad";
        recursion(str, 0,'v');




    }
}
