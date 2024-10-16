package DataStructure.Linear.Array;

public class Q0_sum_of_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int result = sumOf(arr);
        System.out.println(result);
    }
    static int sumOf(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
