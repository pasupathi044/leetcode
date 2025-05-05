class Solution {
    public int numTilings(int n) {
        int MOD = 1000000007;
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        long[] dp = new long[n + 1];
        long[] dp2 = new long[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp2[2] = 1;
        
        for (int i = 3; i <= n; i++) {
            dp2[i] = (dp2[i - 1] + dp[i - 2]) % MOD;
            dp[i] = (dp[i - 1] + dp[i - 2] + 2 * dp2[i - 1]) % MOD;
        }
        
        return (int) dp[n];
    }
}
