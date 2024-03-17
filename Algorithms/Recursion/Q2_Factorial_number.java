package Algorithms.Recursion;

public class Q2_Factorial_number {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(factor(n));
    }
    static int factor(int n){
        //base case
        if( n == 2) {
            return 1;
        }
        return n * factor(n-1);
    }
}
