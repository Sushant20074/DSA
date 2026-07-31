import java.util.*;

class Solution {

    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);  
 
        long maxH = horizontalCuts[0];

        for(int i = 1; i < horizontalCuts.length; i++) {

            maxH = Math.max(maxH,
                    horizontalCuts[i] - horizontalCuts[i - 1]);
        }

        maxH = Math.max(maxH,
                h - horizontalCuts[horizontalCuts.length - 1]);



        long maxW = verticalCuts[0];

        for(int i = 1; i < verticalCuts.length; i++) {

            maxW = Math.max(maxW,
                    verticalCuts[i] - verticalCuts[i - 1]);
        }

        maxW = Math.max(maxW,
                w - verticalCuts[verticalCuts.length - 1]);



        long mod = 1000000007;

        return (int)((maxH * maxW) % mod);
    }
}
