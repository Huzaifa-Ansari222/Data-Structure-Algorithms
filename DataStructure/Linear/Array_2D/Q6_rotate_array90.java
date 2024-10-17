package DataStructure.Linear.Array_2D;

public class Q6_rotate_array90 {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        tansposeSwap(arr);
    }
    static void tansposeSwap(int [][] arr ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {// swap triangle transpose
                int temp = arr[i][j] ;
                arr[i][j] = arr[j][i]; // swap daigonal type
                arr[j][i] = temp;
            }
        }
            for (int i = 0; i < arr.length; i++) {
                for (int j = arr.length-1; j >= 0; j--) {
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

transpose triangle wise:
{1, 4, 7},
{2, 5, 8},
{3, 6, 9}

output
{7, 4, 1},
{8, 5, 2},
{9, 6, 3}
*/