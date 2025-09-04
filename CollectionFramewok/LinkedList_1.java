package collectionFramework;
import java.util.LinkedList;

public class LinkedList_1{

    public static void main(String arg[]){
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.addFirst(2);
        list.add(3);
        list.addFirst(1);
        list.add(2,8);
        list.add(3,0);
        list.add(1,9);
        list.add(2,0);
        System.out.println("The LinkedList is: "+list);

        list.remove(3);
        list.remove(1);
        System.out.println("The LinkedList is: "+list);

        System.out.println("The value of index 4 is : "+list.get(4));
    }
}
    

