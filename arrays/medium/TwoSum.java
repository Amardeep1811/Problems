import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer> mpp = new HashMap<>();
        for(int i = 0; i <nums.length ; i++){
            int sum = target-nums[i];
            if(mpp.containsKey(sum)){
                return new int[]{i , mpp.get(sum)};
            }
            mpp.put(nums[i] , i);
        }
    return new int[]{-1,-1};
    }    

    public static String twoSum1(int[] nums , int target){
        int left = 0 , right = nums.length-1;

        Arrays.sort(nums);

        while(left < right){
            if(nums[left] + nums[right] == target) return "Yes";
            if(nums[left]+nums[right] > target) right--;
            if(nums[left] + nums[right] < target) left++;
        }
        return "False";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the target you want to find : ");
        int k = input.nextInt();

        int[] result = twoSum(arr, k);

        // System.out.print("The target can be achieved by the elements of the indexes : " + result[0] + ", " + result[1]);
        System.out.print("Can the target be achieved : " + twoSum1(arr, k));

    }
}
