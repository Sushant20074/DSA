class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int array[]=new int[101];
        for(int i:nums){
            array[i]++;
            if(array[i]>2){
                return false;
            }
           
        }
        return true;
    }
}