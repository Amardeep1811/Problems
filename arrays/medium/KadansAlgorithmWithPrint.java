public class KadansAlgorithmWithPrint {
     public int maxSubArray(int[] nums) {
        int sum = 0 , max =Integer.MIN_VALUE;
        int start = 0;
        int ansStart = -1 , ansEnd = -1;

        for(int i = 0; i < nums.length ; i++){
            if(sum == 0) start = i;
            sum  += nums[i];
            
            if(sum > max){
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if(sum < 0) sum = 0;
        }
        return max;
    }
}
