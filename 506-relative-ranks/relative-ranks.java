class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;

        int[] sorted = score.clone();

        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for(int i = n - 1; i >= 0; i--) {
            map.put(sorted[i], rank);
            rank++;
        }

        String[] answer = new String[n];

        for(int i = 0; i < n; i++) {

            int r = map.get(score[i]);

            if(r == 1) {
                answer[i] = "Gold Medal";
            }
            else if(r == 2) {
                answer[i] = "Silver Medal";
            }
            else if(r == 3) {
                answer[i] = "Bronze Medal";
            }
            else {
                answer[i] = String.valueOf(r);
            }
        }

        return answer;
    }
}