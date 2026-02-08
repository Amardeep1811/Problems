import java.util.Scanner;

public class SortColors {
    public static void sortColors(int[] nums) {
      int count0 = 0, count1 = 0 , count2 = 0;
        int i = 0;
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] == 0) count0++;
            else if(nums[j] == 1) count1++;
            else if(nums[j] == 2) count2++;
        }

        while(count0 > 0){
            nums[i] = 0;
            count0--;
            i++;
        }

        while(count1 > 0){
            nums[i] = 1;
            count1--;
            i++;
        }

        while(count2 > 0){
            nums[i] = 2;
            count2--;
            i++;
        }
        
        for(int j = 0; j < nums.length ; j++){
            System.out.print(nums[j] + " ");
        }
    }

    public static void sortColors1(int[] nums){
        int low = 0 , mid = 0 , high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else if (nums[mid] == 2 ){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        } 

        for(int i = 0; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }


     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array only 0's, 1's, 2's: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }

        sortColors1(arr);

    }

}

