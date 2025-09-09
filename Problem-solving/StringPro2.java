import java.util.Scanner;

public class StringPro2 {
    
    public static void main(String arg[]){
        System.out.println("Enter your name :");
        Scanner sc= new Scanner(System.in);

        String s=sc.next();

        System.out.println(s);
        s=s+"bhandari";
        System.out.println(s);
        System.out.println(s.length());

        //access ecah Charater
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+ " ");
        }


        sc.close();

    }
}
