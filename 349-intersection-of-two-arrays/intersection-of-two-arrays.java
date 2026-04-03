class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        
        // Using HastSet<Integer> because automatically ignores repeated values.
        HashSet<Integer> set = new HashSet<>();

        for(int value1 : nums2){
            for(int value2 : nums1){
                // check the element of array 1st and 2nd are equal.
                if(value1 == value2){
                    set.add(value1); // ignores repeated values.
                    break;
                }
            }
        }

        // convertion HastSet into array.. 
        int[] arr = new int[set.size()];
        int i = 0;

        for (int num : set) {
            arr[i++] = num;
        }
        return arr;
    }
}