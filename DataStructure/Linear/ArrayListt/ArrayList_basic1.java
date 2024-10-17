package DataStructure.Linear.ArrayListt;

import java.util.ArrayList;

public class ArrayList_basic1 {
    public static void main(String[] args) {
        //declare / ArrayList <Datatype> name = new ArrayList <> ( );
        ArrayList<Integer> list = new ArrayList<>();

        //add / .add(:element)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list); //[10, 20, 30, 40]

        //get / .get(:index)
        System.out.println( list.get(0) ); //10

        //set / .set(:index , :element)
        list.set(0,100);
        System.out.println(list); //[100, 20, 30, 40]

        //remove / .remove(:index)
        list.remove(3);
        System.out.println(list); //[100, 20, 30]  / removing from backward is fast because not need to shift element forward
        list.remove(0);
        System.out.println(list); //[20, 30]  / take time remove from front means all element  need to shift

        //add at  / .add(:index, element)
        list.add(0,1000);
        System.out.println(list);

        //clear
        // list.clear();
        //System.out.println(list); // [ ] empty

        //indexOf /indexOf(:element)
        //give index of element / if not return -1
        int list1 = list.indexOf(100); //-1
        System.out.println(list1); //-1

        int list2 = list.indexOf(20); //1
        System.out.println(list2); //1

        //size
        System.out.println( list.size() ); //3

        //toString
        String listString = list.toString(); // Convert the ArrayList to a String
        System.out.println("ArrayList as String: " + listString); // Print the string representation
        // Checking type of String
        if (listString instanceof String) {
            System.out.println("listString is of type String.");
        }

    }
}
