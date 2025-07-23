class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            (i % 2 == 0 ? even : odd).add(nums[i]);
        }

        Collections.sort(even);               
        odd.sort(Collections.reverseOrder()); 

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i % 2 == 0) ? even.remove(0) : odd.remove(0);
        }

        return nums;
    }
}   