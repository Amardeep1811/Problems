
import java.util.Scanner;

class FindSecondLargest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt(); 
        }

        System.out.println("The Second largest element of the array is : " + findSecondLargest(arr));
    }

    static int findSecondLargest(int[] arr){
        int max = arr[0];
        int secMax = Integer.MIN_VALUE;  // so that it can find 2nd max value even if the array is in negative

        //if array length is 1 then this will handle it arr.length means actual length of the array arr.length<2 means if arr length is 1 then it will throw this 
         
        if(arr.length < 2){
            System.out.println("There is no 2nd largest element");
            return -1;
        }

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max) { 
                secMax = max;
                max = arr[i];
            }

            // if max value appears first then if there is any secondMax value after the max value then it wont be able to find it so this statment

            if(arr[i] > secMax && arr[i] < max){ 
                secMax = arr[i];
            }
        }

        return secMax;
    }
}