//unequal row length called jagged
package DataStructure.Array_2D;

public class Jagged_2D_array {
    public static void main(String[] args) {
        //    int [] [] arr = new int[] [4]; //not allow
        int [] [] arr = new int[3] []; //allow
        arr[0] = new int[2]; // 1row 2col
        arr[1] = new int [5];// 2row 5col
        arr[2] = new int [1];// 3row 1col

        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { //go till i row len
                System.out.print("A["+i+"]["+j+"] =>" +arr[i][j]+"  ");
            }
            System.out.println("");
        }

    }
}
