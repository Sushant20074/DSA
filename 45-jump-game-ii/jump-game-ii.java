class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int g = n-1;
        int c = 0;
        int min = g;
        while(g != 0){
            for(int i=g-1; i>=0; i--){
                if(nums[i] >= g - i){
                    min = Math.min(i, min);
                }
            }
            g = min;
            c++;
        }
        return c;
    }
}