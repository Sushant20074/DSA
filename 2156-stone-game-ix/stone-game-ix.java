class Solution {
    public boolean stoneGameIX(int[] stones) {

        int[] count = new int[3];
        for (int stone : stones) {
            count[stone % 3]++;
        }
        int zero = count[0];
        int one = count[1];
        int two = count[2];

        if (one == 0 || two == 0) {
            return Math.max(one, two) > 2 && zero % 2 == 1;
        }

        return Math.abs(one - two) > 2 || zero % 2 == 0;
    }
}