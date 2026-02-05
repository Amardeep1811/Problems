import java.util.ArrayList;
import java.util.Scanner;

class LeftRotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        if(n == 0) return;

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = (int)(nums.length-k) ; i < nums.length ; i++){
            temp.add(nums[i]);
        }

        for (int i = 0; i < nums.length-k ; i ++){
            temp.add(nums[i]);
        }

        for(int i = 0 ; i < temp.size() ; i++){
            nums[i] = temp.get(i);
        }
    }

    static void rotate1(int arr[] ,int k ){
        int n = arr.length;
        k = k%n;

        arrayRotate(arr, 0, n-1);
        arrayRotate(arr, 0, k-1);
        arrayRotate(arr, k, n-1);

    }

    static void arrayRotate(int[] arr , int start , int end ){
        if (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            arrayRotate(arr, start, end);
        }
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

        rotate1(nums , 3);
        for (int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i]+ " ");
        }
    }
}