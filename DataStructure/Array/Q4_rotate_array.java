package DataStructure.Array;

public class Q4_rotate_array {
    public static void main(String[] args) {
        //IP = [1,2,3,4]
        //OP = [4,3,1,2]
        int [] nums={1,2,3,4};
        int n = nums.length;
        int k=2;
        k = k % n; //todo cyclic rotatation  k = 2 % 4 = 2rotate
        reverseArray( nums ,0 ,  n-1);// frm index 0 - 4...[4,3,2,1]
        reverseArray(nums,0,k-1);//frm index 0-1...[3,4,2,1]
        reverseArray(nums,k,n-1);//frm k to 3....[3,4,1,2]
        //after reverse [3,4,1,2]
        System.out.print("Rotated Array: ");
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public  static  void reverseArray (int [] nums ,int start ,int end){
//        int j;
        for (int i = start,  j = end; i < j;  i++, j--) {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}
