import java.util.Scanner;
class LinearSearch{

    static int linearSearch(int[] arr , int k){
        for(int i = 0 ; i < arr.length; i++){
            if (arr[i] == k) return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = input.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter a new array : ");
        for(int i = 0 ; i < n ; i++){
            nums[i] = input.nextInt();
        }

        System.out.print("Enter the element you want to find : ");
        int findNumber = input.nextInt();

        int k = linearSearch(nums , findNumber);

        if(k < 0) System.out.println("Number is not present in the array");
        else System.out.println("The number is present at Index " + k);
    }
}