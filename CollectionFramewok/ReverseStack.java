import java.util.Stack;
class ReverseStack{

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        bottom(top,s);
    }

    public static void bottom(int data, Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int bottomVal=s.pop();
         bottom(data,s);
         s.push(bottomVal);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);


        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}


