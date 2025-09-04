import java.util.Stack;

public class StackBottom{

    public static void addAtBottom(int data, Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        addAtBottom(data,s);
        s.push(top);
    }
    public static void main(String arg[]){
        Stack<Integer> s=new Stack<>();
        s.push(2);
        s.push(1);
        s.push(3);

        addAtBottom(4,s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }
}