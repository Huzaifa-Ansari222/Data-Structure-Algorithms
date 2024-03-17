package Algorithms.Recursion;

public class Q3_PowerOF {
    public static void main(String[] args) {
        System.out.println( power(4,5));
    }
    static  int  power (int a , int b ){
        if (b==0){
            return 1;
        }
        return a * power(a, b-1);//a * (a^b-1)
    }
}
