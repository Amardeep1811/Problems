import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubarray {
    public static int longestSubarray(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // Case 1: subarray from index 0 to i has sum = k
            if (sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }

            // Case 2: subarray ending at i (not starting at 0)
            if (mpp.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - mpp.get(sum - k));
            }

            // Store the first occurrence of this prefix sum
            if (!mpp.containsKey(sum)) {
                mpp.put(sum, i);
            }
        }

        return maxLength;
    }

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the sum you want to find from array : ");
        int k = input.nextInt();

        System.out.print("Enter the non-zero elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt(); 
        }

        System.out.println("The largest subarray that can find the sum is  : " + longestSubarray(arr, k));
    
    }
}
