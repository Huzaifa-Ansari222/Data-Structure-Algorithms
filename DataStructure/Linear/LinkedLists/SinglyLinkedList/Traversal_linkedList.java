package DataStructure.Linear.LinkedLists.SinglyLinkedList;

public class Traversal_linkedList {


    public static void main(String[] args) {
        Traversal_linkedList list = new Traversal_linkedList();

        // Adding elements to the list
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        // Displaying the list
        list.display();
    }


    class Node{ //class
        int data;
        Node next;

        public Node (int data){ // constructor
            this.data = data;
            this.next = null;
        }
    }
    Node head; // Head of the list

    public void display(){
        Node temp = this.head;

        while(temp != null){
            System.out.print(temp.data+"--->"); //temp is pointer and print Node data
            //move temp pointer forword
            temp = temp.next;
        }
    }


    public void addFirst(int data){
        //make object from Node class
        Node node = new Node(data);// we have constuctor so we data data to contructor
//        node.data = 10;// if we donot used constuctor in class Node
        node.next = this.head; // rhs adress assign to lhs node [ 10|2000 ]--> [  data| 2000 ]
        this.head = node;// point head to first /new node
    }
}

/*
::visual ::

Initial State:
head -> null

After Adding data 10  (addFirst(10)):
head -> [10 | null]

After Adding data 20 (addFirst(20)):
head -> [20 | -> [10 | null]]

After Adding data 30 (addFirst(30)):
head -> [30 | -> [ 20 | -> [10 | null] ]  ]

 */