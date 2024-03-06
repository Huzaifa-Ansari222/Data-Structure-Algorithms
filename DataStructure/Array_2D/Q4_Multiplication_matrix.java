package DataStructure.Array_2D;

public class Q4_Multiplication_matrix {
    public static void main(String[] args) {
        int [][] arr1 = {
                {1,2,3},
                {4,5,6}
        };
        int [][] arr2 = {
                {10,11},
                {20,21},
                {30,31}
        };
        int [][]result =  multiplyMatrix(arr1,arr2);//pass
        // Display the resulting matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] +" ");
            }
            System.out.println();
        }



    }
    static int [][] multiplyMatrix( int [][]array1 , int [][]array2) {
        int rows = array1.length;//2
        int cols = array2[0].length;//2
        int [][] newArray =  new int [rows] [cols];

        for (int row = 0; row < rows; row++) {
            for ( int col = 0; col < cols; col++) {//2x2
                int sum = 0;
                for (int i = 0; i < array2.length; i++) {
                    int mul = array1[row][i] * array2 [i][col];// 1*10; 2*20; 3*30;
                    sum = mul+sum;// sum = 10 + 0; 40+10; 90+50 = 140;
//                    sum += array1[row][i] * array2[i][col];
                }
                newArray[row][col] =  sum;//2x2
            }
        }
        return newArray;
    }

}
