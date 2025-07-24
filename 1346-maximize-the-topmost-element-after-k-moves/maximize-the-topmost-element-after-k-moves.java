class Solution {
    public int maximumTop(int[] nums, int k) {
        int n = nums.length;

        // Edge Case 1: Only one element in the stack
        if (n == 1) {
            // If k is odd, we must remove it, stack becomes empty => return -1
            // If k is even, we can remove and push it back => return that same element
            return (k % 2 != 0) ? -1 : nums[0];
        }

        int max = Integer.MIN_VALUE;

        // Case 1: If we can remove all elements or more, we can choose any of them
        if (k > n) {
            for (int num : nums) {
                max = Math.max(max, num); // Find max of the whole array
            }
        } else {
            // Case 2: Remove up to (k - 1) elements and keep the max to push back later
            for (int i = 0; i < k - 1; i++) {
                max = Math.max(max, nums[i]);
            }

            // Case 3: If k < n, the element at nums[k] may stay at the top after all removals
            if (k < n) max = Math.max(max, nums[k]);
        }

        return max;
    }
}