// Circular queue using array
class CircularQueue{
    static int arr[];
    static int size;
    static int rear=-1;
    static int front=-1;
    CircularQueue(int n){
        arr=new int[n];
        this.size=n;
    }
    static boolean isEmpty(){
        return rear==-1&&front==-1;
    }
    static boolean isFull(){
        return (rear+1)%size==front ;
    }
    static void add(int data){
        if(isFull()){
            System.out.println("Queue full");
            return;
        }
        //1st element 
        if(front==-1){
            front=0;
        }
       rear= (rear+1)%size;
       arr[rear]=data;

    }

    static int dequeue(){
        if(isEmpty()){
            System.out.println("Queue empty");
            return -1;
        }

        int value=arr[front];
        //single element condition
        if(rear==front){
            rear=front= -1;
        }
        else{
        front=(front+1)%size;
        }
        return value;
    }

    static int peek(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        return arr[front];
    }


    public static void main(String args[]){
        CircularQueue q=new CircularQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Remove front element: "+q.dequeue());
        q.add(6);
        System.out.println("Remove front element: "+q.dequeue());
        q.add(7);


        while(!isEmpty()){
            System.out.println(q.dequeue());
            q.peek();
        }


    }
}