class Solution {
    public int missingInteger(int[] nums) {

        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }
        int ans = sum;

        while (true) {

            boolean present = false;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == ans) {
                    present = true;
                    break;
                }
            }

            if (present == false) {
                return ans;
            }

            ans++;
        }
    }
}