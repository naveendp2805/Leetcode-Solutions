class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;

        int[] prefix = new int[n+1];
        for(int i=0; i<n; i++)
            prefix[i+1] = prefix[i] + stoneValue[i];

        int[][] dp = new int[n][n];

        for(int len = 2; len <= n; len++)
        {
            for(int l=0; l + len - 1 < n; l++)
            {
                int r = l + len - 1;

                for(int k=l; k<r; k++)
                {
                    int lSum = prefix[k+1] - prefix[l];
                    int rSum = prefix[r+1] - prefix[k+1];

                    if(lSum < rSum)
                        dp[l][r] = Math.max(dp[l][r], lSum + dp[l][k]);
                    else if(rSum < lSum)
                        dp[l][r] = Math.max(dp[l][r], rSum + dp[k+1][r]);
                    else
                        dp[l][r] = Math.max(dp[l][r], lSum + Math.max(dp[l][k], dp[k+1][r]));
                }
            }
        }

        return dp[0][n-1];
    }
}