package DataStructure.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Q7_add_two_array {
    public static void main(String[] args) {
        int [] one =        {9,9}; //  [0,1]
        int  [] two = {9 , 9 ,9};//[0,1,2]
//            int [] one =        {9,9,5,8};
//            int  [] two = {6 ,7};
        //OP = [10,9,8]
        System.out.println(    addArray(one,two));
    }
    public static ArrayList<Integer> addArray(int []one , int [] two){

        int i = one.length-1;
        int j = two.length-1;
        int carry = 0;
        int rem;
        ArrayList<Integer> result = new ArrayList<Integer>();

        while ( i >= 0 || j>=0){
            int sum = 0; // initailize to 0 becoz we dont want to add previous sum value
            if (i >= 0) {
                sum += one[i] ;// 0+9 =9
            }
            if (j >= 0) {
                sum += two[j]; //9+9 =18
            }
            sum += carry; //18 +0=18

            rem = sum % 10; //18%10 => 8
//            System.out.println("rem" + rem);
            carry = sum / 10; // 18/10 => 1
//            System.out.println("carry " + carry);

            result.add(0,rem);// [,8]
//            System.out.println("result " + result);
            i--;
            j--;
        }
        if(carry != 0){
            result.add(0,carry);
        }
    return result;
    }
}
