package Algorithms.Searching.Binary_Search;

public class BinarySearch {

    public static void main(String[] args) {
        int  [] arr = {1, 2, 4, 5, 7};
        int target = 7;
        int result = BSearch(arr, target);

        if( result == -1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at: "+result);
        }

    }
    static int BSearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1; //// Length is 5 so 0-4 index arr.len-1
        while(start <= end){
//          int  mid=start+end/2 this may exceed from the range if bigger value come
            int middle =start+(end-start)/2;
            if (arr[middle] == target ){
                return middle;
            }
            else if (arr[middle] < target){
                start = middle + 1;
            }
            else{
                end = middle - 1;
            }
        }
        return -1; // Return -1 if the target is not found
    }
}
