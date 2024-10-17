package DataStructure.Linear.Array_2D;

public class Q5_transpose_swap {
    public static void main(String[] args) {
        int [][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        } ;
        tansposeSwap(arr);
    }
    static void tansposeSwap(int arr [][] ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {// swap triangle transpose
                int temp = arr[i][j] ;
                arr[i][j] = arr[j][i]; // swap daigonal type
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" [ "+arr[i][j]+" ]");
            }
            System.out.println();
        }
    }
}
/*
input:
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}

output
{1, 4, 7},
{2, 5, 8},
{3, 6, 9}
*/
