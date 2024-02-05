package DataStructure.Array;

public class Q1_reverse_array {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        System.out.println("wihtout swap ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"|");
        }//10|20|30|40|50|

        System.out.println(""); //line break

        swap(arr);//value swap  50|40|30|20|10|
        System.out.println("after swap");
        for (int i = 0; i < arr.length; i++) { //
            System.out.print(arr[i]+"| ");
        }//print swap value

    }
    public static void swap(int [] arr ){
        int i = 0;
        int j = arr.length-1;
        while( i <= j ) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i ++;
            j--;
        }
    }
}
