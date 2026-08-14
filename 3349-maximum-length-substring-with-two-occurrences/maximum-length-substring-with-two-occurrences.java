class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                int[] freq = new int[26];
                boolean valid = true;
                for (int k = i; k <= j; k++){
                    char ch = s.charAt(k);
                    freq[ch - 'a']++;
                    if (freq[ch - 'a'] > 2) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    int length = j - i + 1;
                    max = Math.max(max, length);
                }
            }
        }
        return max;
    }
}