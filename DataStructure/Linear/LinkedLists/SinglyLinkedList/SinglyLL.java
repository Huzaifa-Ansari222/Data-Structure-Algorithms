package DataStructure.Linear.LinkedLists.SinglyLinkedList;

public class SinglyLL {
    public  static class Node {
        //Node attribute
        int data;

        Node next; //reference to the next node in the list, link between nodes.
        // if Classname used as Datatype inside that Class it means it refrence/pointing itself
        // Reference to the next node (self-referencing)

        //constructor
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {

            // create Object of Node
            Node nodeA = new Node (1);
            System.out.println("A address: "+nodeA);
            Node nodeB = new Node (2);
            System.out.println("B address: "+nodeB);
            Node nodeC = new Node (3);
            System.out.println("C address: "+nodeC);


            // linking Node
            nodeA.next = nodeB;// [1] -> [2]  [3]  null
            System.out.println("A+address B: "+nodeA.next);//nodeA have adress of nodeB
            nodeB.next =  nodeC;// [1] -> [2] -> [3]  null
            System.out.println("B+address C"+nodeB.next);//nodeB have adress of nodeC
            nodeC.next = null; // [1] -> [2] -> [3] -> null

        //Display linked list: [1] -> [2] -> [3] -> null
        System.out.print("[A: " + nodeA.data +"| Next]  --> ");  // Output: 1
        System.out.print("[B: " + nodeB.data+"| Next]  --> ");  // Output: 2
        System.out.print("[C: " + nodeA.next.next.data+"| Next]  --> null");  // Output: 3

        //[Node A: 1 | Next] --> [Node B: 2 | Next] --> [Node C: 3 | Next] --> null
    }
}
