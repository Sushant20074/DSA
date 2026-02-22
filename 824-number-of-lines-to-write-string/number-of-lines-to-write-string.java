class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        
        int lines = 1;    
        int currentWidth = 0; 
        
        for(int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);
            
            // Get width of character
            int letterWidth = widths[ch - 'a'];
            
            // Check if adding this letter exceeds 100
            if(currentWidth + letterWidth > 100) {
                lines++;                  
                currentWidth = letterWidth;
            } else {
                currentWidth += letterWidth;
            }
        }
        
        return new int[]{lines, currentWidth};
    }
}