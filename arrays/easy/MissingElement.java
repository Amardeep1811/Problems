import java.util.Scanner;

public class MissingElement {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int sumOfArray = 0;

        for(int i = 0 ; i< nums.length;i++){
            sumOfArray += nums[i];
        }

        return sum-sumOfArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = input.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter a array in sorted way from 0-n: ");
        for(int i = 0 ; i < n ; i++){
            nums[i] = input.nextInt();
        }

        System.out.println("The missing Element is : " + missingNumber(nums));
    }
}
