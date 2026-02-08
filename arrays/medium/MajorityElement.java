import java.util.Scanner;

public class MajorityElement {
     public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int vote =0;

        if(nums.length < 2){
            candidate = nums[0];
        }

        for(int i =0; i<nums.length; i++){
            if(nums[i] == candidate) vote++;
            else vote--;

            if (vote == 0){
                candidate = nums[i];
                vote++;
            }
        }
    return candidate;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array one element should appear more than n/2 times: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }

        System.out.print("The number that appears more than n/2 times is : " + majorityElement(arr));

    }
}
