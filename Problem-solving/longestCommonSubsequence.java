

import java.io.*;
import java.util.*;
class longestCommonSubsequence{

    static void lcs(String s1,String s2,int m,int n)
    {
        int lcsTable[][]= new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for( int j=0;j<=n;j++)
            {
                if(m==0|| n==0){
                    lcsTable[i][j]= lcsTable[i][j]=0;
                }
                 else if(s1.charAt(i)==s2.charAt(j))
                {
                lcsTable[i][j]=(1+ lcsTable[i-1][j-1]);
                }
                else {
                    lcsTable[i][j]=( Math.max(lcsTable[i-1][j], lcsTable[i][j-1]));
                }
        
            }
            System.out.println("length of LCS is"+ lcsTable[i][j]);
        }
        

    }
    public static void main(String[] args) {
        String s1="komalbhandari";
        String s2="bhan";
        int m=s1.length();
        int n=s2.length();

        
        lcs(s1, s2, m, n);
    }
}