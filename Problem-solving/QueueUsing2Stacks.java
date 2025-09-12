import java.util.Stack;
public  class QueueUsing2Stacks {

    static class Queue{

     static Stack<Integer> s1=new Stack<>();  // orignal stack that store data as a Queue
     static Stack<Integer> s2=new Stack<>();    // helping stack 

   public static boolean isEmpty(){
        return s1.isEmpty();
    }

    public static void add(int data){
        while(!s1.isEmpty()){  // emptying stack 1 into stack 2
            s2.push(s1.pop());
        }
        s1.push(data);  // pushing new data into stack 1

        while(!s2.isEmpty()){   //emptying stack 2 into stack 1 to make it like queue
            s1.push(s2.pop());
        }

    }

     public  static int remove(){ // FIFO
        if(isEmpty()){
            System.out.println("empty Queue");
            return-1;
        }
        return s1.pop();
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("empty Queue");
            return-1;
        }
        return s1.peek();  // peek first element
    }

    }
    public static void main(String[] args) {
        Queue q=new Queue();

        q.add(1); 
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.remove();
        q.add(6);
        q.add(7);

        while(!q.isEmpty()){

            System.out.println(q.peek());
             q.remove();
        }
    }
}
