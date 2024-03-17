package Algorithms.Recursion;

public class Q1_Fibbonaci_number {
    public static void main(String[] args) {
        int n =  4;
        fibo(n);
    }
    static int fibo(int n){
        if (n==1){
            return 1;
        }
        fibo(n-1 );

        return n;

    }
}
