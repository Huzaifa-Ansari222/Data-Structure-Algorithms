package Algorithms.Recursion;

public class Q1_Fibbonaci_number {
    public static void main(String[] args) {
        System.out.println(   fibo(4) );
    }
    static int fibo(int n){
        if (n<2){ //0-> 0 ; 1-> 1 ;
            return n;
        }
        //LHS  will excute first then the RHS will start execute and + and give result to the functionn where it was called

        return fibo(n-1) + fibo(n-2);
    }
}
