package DataStructure.Collections_Framework._01_Lists.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1_Basic_Level {
    public static void main(String[] args) {
        List<String> alist = new ArrayList<>();

        //1.add name and print it
        alist.add("huz");
        alist.add("ami");
        alist.add("jun");
        alist.add("aqu");
        alist.add("ahm");
        System.out.println(alist);

        //2.insert element at index
        alist.add(2,"han");
        System.out.println(alist); //insert han also

        //3.remove element by value and index
        alist.remove(1);
        alist.remove("jun");
        System.out.println(alist);

        //4.check if exist
        String search = "ami";
        if (alist.contains(search)) {
            System.out.println(search + "exists");
        } else {
            System.out.println("not exists");
        }

        //5.print size and print element with for loop & for-each
        System.out.println(alist.size());

        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(+i)+" ");
        }
        System.out.println(" ");

        for (String print : alist) {
            System.out.print(print+" ");
        }
        System.out.println("");
        System.out.println("ArrayList to array vise versa");
        //6. ArrayList to array
        String[] array = alist.toArray(new String[0]);//ArrayList to array String
        for (String print : array) {//print array
            System.out.print(print+" ");
        }
        System.out.println("");
        //array to Arraylist
        ArrayList <String> list = new ArrayList<>(Arrays.asList(array));
        for (String printa : array) {//print array
            System.out.print(printa+" ");
        }
        //to verify
        System.out.println("Is 'array' an array? " + (array instanceof String[]));
        System.out.println("Is 'list' an ArrayList? " + (list instanceof ArrayList));

        System.out.println("Array size: " + array.length);
        System.out.println("ArrayList size: " + list.size());

        System.out.println("First element from array: " + array[0]);
        System.out.println("First element from ArrayList: " + list.get(0));

        //remove all element
//        alist.removeAll(alist);
        System.out.println(alist);



    }
}
