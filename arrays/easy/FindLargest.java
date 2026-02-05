
import java.util.Scanner;

class FindLargest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt(); 
        }

        System.out.println("The largest element of the array is : " + findLargest(arr));
    }

    static int findLargest(int[] arr){
        int max = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}