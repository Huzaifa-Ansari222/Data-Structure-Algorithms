package Algorithms.Recursion;

public class Q4_Recursive_array_print {
    public static void main(String[] args) {
        int [] arr = {11,22,33,44};
        printArray(arr , 0);
    }
    static void printArray(int []arr, int idx){

        // base case
        if(idx >= arr.length) return; //0>=6
        System.out.println("arr: "+arr.length+ " idx: " +idx);

        //self work
        System.out.println(arr[idx]);

        //recusive call
        printArray(arr, idx +1); //parameter used for array recursive

    }
}
