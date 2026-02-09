class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> sIndexMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sIndexMap.put(s.charAt(i), i);
        }

        int totalDifference = 0;
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i); 
            int originalIndex = sIndexMap.get(ch); 
            totalDifference += Math.abs(originalIndex - i);
        }

        return totalDifference;
    }
}