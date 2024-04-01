package Algorithms.Recursion;

public class Q0_Print_natural {
    public static void main(String[] args) {
     int n=1;
     print(n);
    }
    static void print(int n){
        if(n >= 6){
            return;
        }
        print(n+1);
//        System.out.println(n);// 5 4 3 2 1
//         print reversed...
//hi
    }

}
