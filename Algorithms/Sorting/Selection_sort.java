package Algorithms.Sorting;

public class Selection_sort {
    public static void main(String[] args) {
    int [] arr = {1,4,-2,7,0,10};
    selectionSort(arr);
    }
    static void selectionSort (int [ ] arr) {

        for (int i = 0; i < arr.length-1; i++) { //
            int minValue = arr[i]; //
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) { //
                if( arr[j] < minValue){ //update min is condition is true
                    minValue = arr[j]; //val: -2
                    minIndex = j;// & indx:2
                }
            }
            //swap  arr[i]: 1 <--> arr[minIndex] : -2
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int res : arr) {
            System.out.println(res);
        }
    }
}

/*
Input: nums = [1,4,-2,7,0,10]
Output: [-2,0,1,4,7,10]
s1: i at 0 move j
s2: if find minval save indx and val
s3: swap the value with minval and indx
time complexity : O(n^2)
O(n^2) == take 25 sec
O(nlogn) == tak 0.00078 ms
 */
