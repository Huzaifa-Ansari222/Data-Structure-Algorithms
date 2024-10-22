package Algorithms.Recursion;

public class Q5_Print_array {
    public static void main(String[] args) {
        int[ ] arr = {1,2,3,4};
        int i = 0;
        printArray(arr , i);

    }
    static void printArray(int []arr , int i){
        if(i == arr.length){
            return;
        }
        System.out.println(arr[i]);
        printArray(arr , i+1);
    }
}
