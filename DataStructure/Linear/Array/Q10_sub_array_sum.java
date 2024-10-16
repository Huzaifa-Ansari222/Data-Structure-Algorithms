package DataStructure.Linear.Array;

public class Q10_sub_array_sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        subArraySum(arr);

    }

    static int subArraySum(int[] arr) {
        int sum = 0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {

                //print subarray
                for (int i = start; i <= end; i++) {
                    sum = sum + arr[i];
                    System.out.print(arr[i] + " ");
                }
                System.out.println("   = sum :"+sum);
                sum=0;
            }
        }
        return sum;
    }
}

