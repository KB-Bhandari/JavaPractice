package collectionFramework;
     class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
       }   }
     class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        } 
        //Push data 
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
		return;
            }
            newNode.next=head;
            head=newNode;
         } 
         //Pop Data
         public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
         }
         //Peek Operation
         public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            return top;
         }    
}
	public class StackClass {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        

	while(!s.isEmpty()){
	System.out.println(s.peek());
	s.pop();
	}
    }

}
