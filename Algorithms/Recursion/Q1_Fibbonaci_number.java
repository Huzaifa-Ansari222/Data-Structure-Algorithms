package Algorithms.Recursion;

public class Q1_Fibbonaci_number {
    public static void main(String[] args) {
        System.out.println(   fibo(7) );
    }
    static int fibo(int n){
        if (n<2){ //0-> 0 ; 1-> 1 ;
            return n;
        }
        return fibo(n-2) + fibo(n-1);

    }
}
