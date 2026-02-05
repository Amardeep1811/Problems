
import java.util.Scanner;

public class MoveZeroAtEnd{
    public static void moveZero(int[] nums) {
        int j=-1;
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1) return;

        for(int i = j+1;i<nums.length ; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        System.out.print("The new array with zeros at its end is : ");
        for(int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = input.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter a new array with zeros : ");
        for(int i = 0 ; i < n ; i++){
            nums[i] = input.nextInt();
        }

        moveZero(nums);
    }
}
