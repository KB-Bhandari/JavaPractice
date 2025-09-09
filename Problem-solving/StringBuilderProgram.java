import java.util.Scanner;

public class StringBuilderProgram {
    
    public static void main(String[] args) {
        

        System.out.println("Using String builder");

        StringBuilder s=new StringBuilder("Komal");
        s.append("Bhandari");
        System.out.println(s);

        // replace character

        s.replace(0, 05, "Hemlata");
        System.out.println("Updated name : "+s);

        //reverse the string
        System.out.println("Reverse string : " + s.reverse());


        System.out.println("Enter Your First name");
        Scanner sc=new Scanner(System.in);

        StringBuilder name=new StringBuilder(sc.nextLine());
        System.out.println("Name: "+name);

        //Add last Name
        System.out.println("Enter your Last Name: ");
        name.append(" "+sc.nextLine());
        System.out.println("Full Name: "+ name + "");
        sc.close();
    }
}
