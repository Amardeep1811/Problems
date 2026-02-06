import java.util.Scanner;

public class FindingSingleNumber {
    public static int singleNumber(int[] nums) {
        int xorSum = 0; 

        for(int i = 0 ; i < nums.length ; i++){
            xorSum ^= nums[i];
        }

        return xorSum;
    } 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        System.out.print("The element the appears only once is : "+ singleNumber(nums));
    }
}
