package DataStructure.Linear.Array;
import java.util.ArrayList;

public class Q5_arrayList_find_duplicate {
    public static void main(String[] args) {
            int [] arr1 = {10,20,30,40,10,20};
            int [] arr2 = {5,20,20,10,30,40,90};

        ArrayList <Integer> arr3 = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    arr3.add(arr1[i]);
//                    System.out.println("i :"+i+" ,arr1: "+arr1[i]+"   j :"+j+" ,arr2 :"+arr2[j]+"   so arr1 :"+arr1[i]);

                }
            }

        }
        int size= arr3.size();
//        System.out.println("size "+size);
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(arr3.get(i)==arr3.get(j)){ // .get if u work on ArrayList
//                    System.out.println("j index befor remove:"+j+" _arr3 value:"+arr3.get(i));
                    arr3.remove(j);
                    size--;//size -1 after .remove
                    j--; // after .remove j cant read current index so we move 1 step back
                    //System.out.println("j index after remove "+j +" _arr3 value:"+arr3.get(j));

                }
            }
        }
        for (Integer printArr3 : arr3) {
            System.out.println(printArr3);
        }
    }
}
