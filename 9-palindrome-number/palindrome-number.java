class Solution {
    public boolean isPalindrome(int x) {
        boolean ans=true;
        String s=String.valueOf(x);
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                ans=false;
                break;
            }
            i++;
            j--;
        }
        return ans;
    }
}