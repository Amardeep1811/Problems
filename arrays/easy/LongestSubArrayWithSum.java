import java.util.Scanner;

public class LongestSubArrayWithSum {
    static int findSubarray(int[] nums , int k){
        int n = nums.length;
        int prefixSum = nums[0];
        int maxLength = 0 , right = 0 , left = 0;

        while(right < n){
            while(left <= right && prefixSum > k){
                prefixSum -= nums[left];
                left++;
            }

            if(prefixSum == k){
                maxLength = Math.max(maxLength , right - left +1);
            }

            right++;
            if(right < n) prefixSum += nums[right];
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

        System.out.println("The largest subarray that can find the sum is  : " + findSubarray(arr, k));
    }
}
