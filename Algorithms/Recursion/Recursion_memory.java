// function call itself is called recursion
// function finished execution its removed from stack and the flow of program is restored to where the function was called
package Algorithms.Recursion;

public class Recursion_memory {
    public static void main(String[] args) {
        int n;
        print();
    }
    static  void  print(){
        System.out.println("1");
        print1();
    }
    static  void  print1(){
        System.out.println("2");
        print2();
    }
    static  void  print2(){
        System.out.println("3");
        print3();
    }
    static  void  print3(){
        System.out.println("4");
    }




}
