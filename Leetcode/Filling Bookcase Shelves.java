public class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int w = 0;
            int h = 0;
            dp[i] = Integer.MAX_VALUE;
            for (int j = i - 1; j >= 0; j--) {
                w += books[j][0];
                h = Math.max(h, books[j][1]);
                if (w <= shelfWidth) {
                    dp[i] = Math.min(dp[i], dp[j] + h);
                } else {
                    break;
                }
            }
        }

        return dp[n];
    }
}
