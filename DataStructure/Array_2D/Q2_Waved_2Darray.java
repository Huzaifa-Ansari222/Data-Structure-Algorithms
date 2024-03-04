/*
given 2d array
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]

output= 1,4,7,8,5,2,3,6,9
 */

package DataStructure.Array_2D;

public class Q2_Waved_2Darray {
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//        System.out.println(printWave(arr));
        printWave(arr);
    }
    static void printWave(int [][] array) {
        for (int col = 0; col < array[0].length; col++) {
            if(col % 2 == 0){
//                print down
                for (int row = 0; row < array.length; row++) {
                    System.out.println(array[row][col]);
                }
            }
            else {
//                print up
                for (int row = array.length-1 ; row >= 0; row--) {
                    System.out.println(array[row][col]);
                }
            }
        }
    }
}
