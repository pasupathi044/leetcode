class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0, sum2 = 0;
        int z1 = 0, z2 = 0;
        for (int x : nums1) {
            if (x == 0) z1++;
            else sum1 += x;
        }
        for (int x : nums2) {
            if (x == 0) z2++;
            else sum2 += x;
        }
        // If both have no zeros
        if (z1 == 0 && z2 == 0) {
            return sum1 == sum2 ? sum1 : -1;
        }
        if (z1 == 0) {
            long need = sum1 - sum2;
            if (need < z2) return -1;
            return sum1;
        }
        if (z2 == 0) {
            long need = sum2 - sum1;
            if (need < z1) return -1;
            return sum2;
        }
        long S = Math.max(sum1 + z1, sum2 + z2);
        return S;
    }
}
