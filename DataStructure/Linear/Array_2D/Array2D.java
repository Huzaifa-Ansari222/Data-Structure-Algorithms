/*
* array of array called 2d array
* [  [1,2,3],  [4,5,6],  [7,8,9]  ]  #3row x 3col
* [1, 2 , 3] index= 00 ,01, 02
* [4, 5 , 6] index= 10 ,11, 12
 * [7, 8 , 9] index= 20 ,21, 22
 * |  1   |  2   |  3  |
*  |-----|-----|- ---|
*  |  4   |  5  |  6  |
*  |-----|-----|----|
*  |  7   |  8  |  9  |
 * */
package DataStructure.Linear.Array_2D;

public class Array2D {
    public static void main(String[] args) {
//        way 1 to decalre 2d array
        int [] []  arr = new int [3] [4] ; // 3 row  , 4 col
//        way 2 to decalre 2d array
        int []  [] arr2 = {
                {1, 2, 3}, //flip 90 deg
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr.length); //3
        System.out.println(arr[0].length); //4

        //access value
        System.out.println(arr2[1] [2]) ; //6

        //set value
        arr2[1] [2] =99;
        System.out.println(arr2[1] [2]);

//        print all value in 2d array
        int []  [] arr3 = {
                {11, 12, 13}, //flip 90 deg
                {21, 22, 23},
                {31, 32, 33}
        };
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print("A["+i+"]["+j+"] =>" +arr3[i][j]+"  ");
            }
            System.out.println("");
        }
        //enhance way to print 2d array
        for (int [] val : arr3){ //every row
            for (int temp : val){ //inside arry row -> col
                System.out.print(temp+" ");
            }
            System.out.println("");

        }


    }
}
