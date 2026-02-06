import java.util.ArrayList;
import java.util.Scanner;
class UnionOfTwoSortedArrays{

    static void union(int[] arr , int n , int[] arr2 , int m){
        ArrayList<Integer> unionArr = new ArrayList<>();
        int i = 0;
        int j = 0 ;

        while(i<n && j<m){
            if(arr[i] <= arr2[j]){
                if(unionArr.size() == 0 || arr[i] != unionArr.getLast()){
                    unionArr.add(arr[i]);
                }
                i++;
            } 
            else if (arr2[j] <= arr[i]){
                if(unionArr.size() == 0 || arr2[j] != unionArr.getLast()){
                    unionArr.add(arr2[j]);
                }
                j++;
            }
        }

        while(i<n){
            if(arr[i] != unionArr.getLast()){
                unionArr.add(arr[i]);
            }
            i++;
        }

        while(j<m){
            if(arr2[j] != unionArr.getLast()){
                unionArr.add(arr[j]);
            }
        }

        for(int index : unionArr){
            System.out.print(index + " ");
        }

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = input.nextInt();
        int[] nums1 = new int[n];
        
        System.out.println("Enter a new array : ");
        for(int i = 0 ; i < n ; i++){
            nums1[i] = input.nextInt();
        }


        System.out.print("Enter the length of the Second array : ");
        int m = input.nextInt();
        int[] nums2 = new int[m];


        System.out.println("Enter the second array : ");
        for(int i = 0 ; i < m ; i++){
            nums2[i] = input.nextInt();
        }

        union(nums1, n, nums2, m);
    }
}