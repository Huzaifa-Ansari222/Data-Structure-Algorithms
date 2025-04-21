package Maths;

public class Q1_Plindrome {
    public static void main(String[] args) {
//        int x=121;
//        isPalindrom(121);
        System.out.println(isPalindrom(121));
    }
    static boolean isPalindrom (int x){
        int temp=x; //121
        int rev=0;

        while (x>0){//121 ; 12 ; 1
            int digit = x%10;// 121%10=1;  12%10= 2;  1%10=1;
            rev=(rev*10)+digit; // rev=0*10+1 = 1;  1*10+2=12;  12*10+1=121 ans
            x = x /10; // x=121/10 =12;  12/10=1;  1/10=0
        }
        if (rev == temp){ //121 ==121
            return true;
        }
        return false;
    }
}
