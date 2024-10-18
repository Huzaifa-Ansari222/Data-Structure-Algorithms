package Algorithms.Sorting;

public class Selection_sort {
    public static void main(String[] args) {
    int [] arr = {1,4,-2,7,0,10};
    selectionSort(arr);
    }
    static void selectionSort (int [ ] arr) {

        for (int i = 0; i < arr.length-1; i++) { //
            int minValue = arr[i];
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) { //
                if( arr[j] < minValue){ //update min is condition is true
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            //swap  arr[i]: 1 <--> minVal : -2
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int res : arr) {
            System.out.println(res);
        }
    }


}
