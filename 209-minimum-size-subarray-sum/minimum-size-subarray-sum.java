class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int i = 0;   // start pointer
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        
        for (int j = 0; j < nums.length; j++) {  // end pointer
            
            sum += nums[j];  // expand window
            
            while (sum >= target) {  // shrink window
                minLength = Math.min(minLength, j - i + 1);
                sum -= nums[i];
                i++;
            }
        }
        
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
