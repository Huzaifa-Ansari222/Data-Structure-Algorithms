package DataStructure.Linear.Array_2D;

public class Q7_rotate_image {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        rotate(matrix);
    }
    static void rotate(int[][] matrix) {
        // Transpose the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) { // swap triangle transpose
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i]; // swap diagonal elements
                matrix[j][i] = temp;
            }
        }

        // Reverse each row to rotate the matrix 90 degrees
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) { // /2 from swap time
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j]; //index - j = j to swap
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }

        // Output the rotated matrix in the expected format
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" [ " + matrix[i][j] + " ] ");
            }
            System.out.println(); // move to the next line after each row
        }
    }
}
