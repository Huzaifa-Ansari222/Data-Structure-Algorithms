package DataStructure.Linear.LinkedLists.SinglyLinkedList;

public class SinglyLL {
    class Node {
        //node attribute
        int data;
        Node next; //reference to the next node in the list, link between nodes.

        //constructor
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
            // create instance of outer class because Node class is non-static class.
            // to access it you need to first create an instance of the outer class which is SinglyLL
            SinglyLL singlyll = new SinglyLL( ); //allows access to the inner Node class.

            // create Object of Node
            Node nodeA = singlyll.new Node (1);
            Node nodeB = singlyll.new Node (2);
            Node nodeC = singlyll.new Node (3);

            // linking Node
            nodeA.next = nodeB;
            nodeB.next =  nodeC;
            nodeC.next = null;

        // Display linked list: [1] -> [2] -> [3] -> null
        System.out.print("[A: " + nodeA.data +"| Next]  --> ");  // Output: 1
        System.out.print("[B: " + nodeA.next.data+"| Next]  --> ");  // Output: 2
        System.out.print("[C: " + nodeA.next.next.data+"| Next]  --> null");  // Output: 3

        //  [Node A: 1 | Next] --> [Node B: 2 | Next] --> [Node C: 3 | Next] --> null
    }
}
