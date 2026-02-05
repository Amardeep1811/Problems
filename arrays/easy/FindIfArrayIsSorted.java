
import java.util.Scanner;

class FindIfArrayIsSorted{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt(); 
        }

        System.out.println(arraySorted(arr));
    }

    static boolean arraySorted(int[] arr){
        int count = 0;
 
        if(arr.length <= 1) return true;
        
        for(int i = 0 ; i <= arr.length-2; i++){
            if(arr[i] <= arr[i+1]){
                count++;
            }
        }

        if(count == arr.length-1) return true;
        else return false;

    }

    // we take a early exit as soon as the ith index is bigger than the i+1 index

    static boolean isSorted(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}