
import java.util.Scanner;

public class RemoveDuplicates{
    public static int removeDuplicates(int[] nums) {
        int j = 0; 
        for (int i = 1 ; i <nums.length ; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = input.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter a new sorted array with duplicates : ");
        for(int i = 0 ; i < n ; i++){
            nums[i] = input.nextInt();
        }

        int k = removeDuplicates(nums);

        System.out.println("The new sorted array with no duplicates is : ");
        //we are only printing less than k because j was started from 0 and we returned j+1 and i started fromm zero so we printed till less than k
        
        for(int i = 0 ; i < k ; i++){       
            System.out.print(nums[i] + " ");
        }
    }
}
