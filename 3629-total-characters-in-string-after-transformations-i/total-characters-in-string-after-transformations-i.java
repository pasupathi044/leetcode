class Solution {
    public int lengthAfterTransformations(String s, int t) {
        if (t == 0) {
            return s.length();
        }
        
        final long MOD = 1_000_000_007L;
        long[] prev = new long[26];
        java.util.Arrays.fill(prev, 1L);
        long[] curr = new long[26];
        
        for (int step = 1; step <= t; step++) {
            for (int c = 0; c < 25; c++) {
                curr[c] = prev[c + 1];
            }
            curr[25] = (prev[0] + prev[1]) % MOD;
            
            // Swap prev and curr arrays for the next iteration
            long[] temp = prev;
            prev = curr;
            curr = temp;
        }
        
        long total = 0;
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            total = (total + prev[index]) % MOD;
        }
        
        return (int) total;
    }
}
