package DataStructure.Linear.Array;

//import java.util.Arrays;

public class Q8_running_array {
    public static void main(String[] args) {
    int [ ] nums =  { 1,2,3,4};
    int newResult [] = runningSum(nums);//store result value in newResult
        for(int results: newResult){ //for each
            System.out.println(results);
        }
//    for (int i = 0; i < newResult.length; i++) { //newResult have value of runningSum(nums)
//    System.out.println(newResult[i]);
//    }
//        System.out.println(Arrays.toString(runningSum(nums)));

    }
    public  static int[] runningSum(int[] nums) {
        int [] result = new int [nums.length];
        result[0]= nums[0] ;//put  nums 0 index value = result 0 index element value
        for (int i = 1; i < nums.length; i++) {
            result[i] = nums [i] + result [i-1];
        }
        //for (int i = 0; i < result.length; i++) {
        //System.out.println(result[i]);
        //}
        return result;
    }


    }
