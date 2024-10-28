package Algorithms.Recursion;

public class Q2_Factorial_number {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(factor(n));
    }
    static int factor(int n){
        //base case
        if( n == 1 || n == 0) {
            return 1;
        }
        return n * factor(n-1);
    }
}
