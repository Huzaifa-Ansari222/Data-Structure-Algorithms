package DataStructure.Linear.Array;

public class Q11_max_in_subArray {
    public static void main(String[] args) {
        int[] arr = {-1,1, 2, 3, 4,};

        subArraySum(arr);

    }

    static void subArraySum(int[] arr) {
        int sum = 0;
        int max=0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {

                //print subarray
                for (int i = start; i <= end; i++) {
                    sum = sum + arr[i];
                    System.out.print(arr[i] + " +");
                }
                System.out.println("  --> "+sum);
                if (max < sum){
                    max=sum;
                }
                sum=0;
            }
        }
        System.out.println(" max value in sub array --> "+max);
    }
}

