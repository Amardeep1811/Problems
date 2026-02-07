
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubArrayWithSumZero {
    static int longestSubarray(int[] arr){
        Map<Integer , Integer> mpp = new HashMap<>();
        int sum = 0 , maxLength = 0;

        for(int i = 0 ; i < arr.length; i++){
            sum += arr[i];
            
            //check if the sum is zero , if not goto else box
            if(sum == 0){
                maxLength = Math.max(maxLength, i+1);
            } else {
                //check if the key appears in the hashmap
                if(mpp.containsKey(sum)){
                    maxLength = Math.max(maxLength, i - mpp.get(sum));
                } else {
                    mpp.put(sum , i);
                }
            }
        }
        return maxLength;
    }    

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt(); 
        }

        System.out.println("The largest subarray whose sum is zero is  : " + longestSubarray(arr));
    }
}
