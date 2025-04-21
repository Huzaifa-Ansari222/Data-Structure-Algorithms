package DataStructure.Linear.LinkedLists.SinglyLinkedList;

public class LinkeddList {
    public static void main(String[] args) {
        class Node {
            int data;
            Node next; // if Classname used as Datatype inside that Class it means it refrence/pointing itself/self refrence
        }

        //Creating 3 node object from Class 'Node'
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        //[node1] ──► (Node object)  //node1 point to Node class
        //             ├── data: 10
        //             └── next: node2

        //Putting value in node 'data'
        node1.data = 10;
        node2.data = 20;
        node3.data = 30;

        //Linking the nodes
        node1.next = node2; // node1 --> node2
        node2.next = node3; // node2 --> node3
        node3.next = null;     // node3 --> null

        //Traversal the list start from node1 / just to print all nodes value
        Node current = node1; // 'current' is a reference variable to traverse the list / current point at node1 in start
        // current is a reference variable of type Node, which points to a node object (in this case, it points to node1 initially).
        //String name ="huzz";
        //DataType refVar = "String Object"
        //Create a new reference variable called current that also points to the same Node object that node1 is pointing to
        //refVar[current] --> Node <- [node1]refVar  // current =  node1 --> Node
        /*
        [node1] ──┐
                  ▼
            (Node object)
                ├── data: 10
                └── next: node2
                    └── next: node3
                    └── next: null
                    ^
        [current] ──┘
         */

        // now i can use current
        //Printing nodes
        while(current  != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}

/*
[node1] ──┐
          ▼
        (Node object)
            ├── data: 10
            └── next ──► (Node object)
                            ├── data: 20
                            └── next ──► (Node object)
                                            ├── data: 30
                                            └── next ──► null
                  ^
[current] ────────┘ (starts from node1)
*/