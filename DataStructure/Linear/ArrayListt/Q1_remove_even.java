package DataStructure.Linear.ArrayListt;

import java.util.ArrayList;

public class Q1_remove_even {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Before even remove: "+list); //[1, 2, 3, 4, 5, 6]
        removeEven(list);
        System.out.println("After even remove: "+list); // [1, 3, 5]

    }
    static void removeEven(ArrayList<Integer>list){
        //start from backward it take less time
        for (int i = list.size() -1 ; i>=0; i--) {
            if(list.get(i) %2 ==0){
                list.remove(i);
            }
        }
    }
}
