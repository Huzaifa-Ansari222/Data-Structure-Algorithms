/*
*
    {1, 2, 3},
    {4, 5, 6}, 2*3
    *
    *output =
    * {1,4}
    * {2,5}
    * {3,6} 3*2
*
* */

package DataStructure.Array_2D;

public class Q3_Transpose {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int [] [] ans = transpose(mat);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.println(ans[i][j]);
            }
            System.out.println();
        }
    }

     static int[][] transpose(int [][] matrix ) {
            int col = matrix[0].length; //goes { { col.len },{ col.len } }
            int row = matrix.length; // { row.len }
            int [][] ans = new int[col] [row];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans [j] [i] = matrix [i] [j];// transpose [2][3] = [3][2]
                }
            }
            return ans;
        }
    }
