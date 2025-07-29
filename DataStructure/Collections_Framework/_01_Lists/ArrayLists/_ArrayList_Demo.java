package DataStructure.Collections_Framework._01_Lists.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class _ArrayList_Demo {
    public static void main(String[] args) {
        // Create ArrayList
        List<String> stringList = new ArrayList<>();

        // Add elements
        stringList.add("Huzaifa");
        stringList.add("Amir");
        stringList.add("Junaid");

        // Add element at specific index
        stringList.add(1, "Salman");

        // Print the list
        System.out.println("Initial List: " + stringList);

        // Get element at index
        System.out.println("Element at index 2: " + stringList.get(2));

        // Set (replace) element at index
        stringList.set(2, "Raza");
        System.out.println("After set at index 2: " + stringList);

        // Remove by index
        stringList.remove(1);
        System.out.println("After removing index 1: " + stringList);

        // Remove by value
        stringList.remove("Huzaifa");
        System.out.println("After removing 'Huzaifa': " + stringList);

        // Contains
        System.out.println("Contains 'Amir'? " + stringList.contains("Amir"));

        // Size
        System.out.println("Size: " + stringList.size());

        // IsEmpty
        System.out.println("Is Empty? " + stringList.isEmpty());

        // IndexOf
        stringList.add("Amir");
        System.out.println("Index of 'Amir': " + stringList.indexOf("Amir"));

        // LastIndexOf
        System.out.println("Last index of 'Amir': " + stringList.lastIndexOf("Amir"));

        // Iterate with for-each
        System.out.print("For-each iteration: ");
        for (String name : stringList) {
            System.out.print(name + " ");
        }
        System.out.println();

        // Convert to array
        String[] array = stringList.toArray(new String[0]);
        System.out.print("Array: ");
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Clear the list
        stringList.clear();
        System.out.println("After clear: " + stringList);
        System.out.println("Is Empty after clear? " + stringList.isEmpty());
    }
}
