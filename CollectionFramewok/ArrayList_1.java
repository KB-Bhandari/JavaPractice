package collectionFramework;
import java.util.ArrayList;

public class ArrayList_1{

    
    public static void main(String arg[]){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.addFirst(7);
        list.addLast(8);

        list.remove(2);
        System.out.println(list);

        //print complete list
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");

        }



    }
}