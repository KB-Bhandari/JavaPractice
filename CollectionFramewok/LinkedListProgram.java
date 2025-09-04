package collectionFramework;

public  class LinkedListProgram {

    int size=0;
    LinkedListProgram(){
        this.size=size;
        //  size++;
    }
    Node head;
    class Node{
        String data;
        Node next;
        

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }

    }   
        //add first node
        public void addFirst(String data){
            Node newNode= new Node(data);
            if(head==null){
                head=newNode;
                return;
            }

            newNode.next=head;   
            head=newNode;
        }

        //add Last Node
        public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }

        currNode.next=newNode;
          }

          //delete First node
          public void deleteFirst(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            size--;
            head=head.next;

          }

          //delete Last node
          public void deleteLast(){
            if(head==null){
                System.out.println("Liast is empty");
                return;
            }
             size--;
            if(head.next==null){
                head=null;
                return;
            }

            Node secondNode =head;
            Node lastNode=head.next;
            while(lastNode.next!=null){
                lastNode=lastNode.next;
                secondNode=secondNode.next;
            }
            secondNode.next=null;
          }

          //Print LinkedList
          public void printList(){
            if(head==null){
                System.out.println("The List is empty");
                return;
            }
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data+" -> ");
                currNode=currNode.next;
            }
            System.out.println("Null");
          }

          //print size
          public int listSize(){
            return size;
          }
        
    
    public static void main(String[] args) {
        LinkedListProgram list=new LinkedListProgram();
        list.addFirst("am");
        list.addFirst("I");
        list.printList();
        int size=list.listSize();
        System.out.println("Size of Linked List is : "+size);

        list.addLast("Komal");
        list.addLast("Bhandari");
        list.printList();
        size=list.listSize();
        System.out.println("Size of Linked List is : "+size);

        list.deleteFirst();
        list.printList();
         size=list.listSize();
        System.out.println("Size of Linked List is : "+size);

        list.deleteLast();
        list.deleteLast();
        list.printList();
        size=list.listSize();
        System.out.println("Size of Linked List is : "+size);

        list.addLast("Komal");
        list.addLast("Bhandari");

        list.printList();
        size=list.listSize();
        System.out.println("Size of Linked List is : "+size);
    }
}
 