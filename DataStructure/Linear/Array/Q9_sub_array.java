package DataStructure.Linear.Array;

public class Q9_sub_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};

        subArray(arr);

    }
    static void subArray(int [] arr){
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {

                //print subarray
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
