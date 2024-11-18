package DataStructure.Linear.LinkedLists.SinglyLinkedList;

public class LinkeddList {
    public static void main(String[] args) {
        class Node {
            int data;
            // Reference to the next node (self-referencing)
            Node next; // if Classname used as Datatype inside that Class it means it refrence/pointing itself
        }

        //Creating 3 node from Class 'Node'
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();

        //Putting value in node 'data'
        node1.data = 10;
        node2.data = 20;
        node3.data = 30;

        //Linking the nodes
        node1.next = node2; // node1 --> node2
        node2.next = node3; // node2 --> node3
        node3.next = null;     // node3 --> null

        //Traversal the list start from node1
        Node current = node1; // 'current' is a reference variable to traverse the list
        // current is a reference variable of type Node, which points to a Node object (in this case, it points to node1 initially).

        //Printing nodes
        while(current  != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}

