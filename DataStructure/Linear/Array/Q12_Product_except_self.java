package DataStructure.Linear.Array;

public class Q12_Product_except_self {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4};
        int [] ans = productExceptSelf(nums);
        // Print the answer array
        for (int num : ans) {
            System.out.println(num);
        }
//        System.out.println(ans);
    }
    public static int[] productExceptSelf(int[] nums) {
        int [] answer = new int [nums.length];
        int mul = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    mul = mul * nums[j];
                }
            }
            answer[i]=mul;
            mul=1;
        }
        return answer;
    }
}

 //time exceed "self"

/*
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
*/
