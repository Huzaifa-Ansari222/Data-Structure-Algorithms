package DataStructure.Array_2D;

public class Q3_Transpose {
    public static void main(String[] args) {
        int [][]mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        transpose(mat);

    }
    public static int[][] transpose(int[][] matrix) {

            int col = matrix[0].length; //goes { { col.len },{ col.len } }
            int row = matrix.length; // { row.len }
            int [][] ans = new int[col] [row];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans [i] [j] = matrix [i] [j];// transpose [2][3] = [3][2]
            }
        }
        return ans;
        }
}
