class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;

    }

    void backtrack(List<List<Integer>> list, List<Integer> innerList, int[] nums) {
    if (0 == nums.length) {
        list.add(new ArrayList<>(innerList));
        return;
    }
    innerList.add(nums[0]);
    backtrack(list, innerList, Arrays.copyOfRange(nums, 1, nums.length));
    innerList.remove(innerList.size() - 1);
    backtrack(list, innerList, Arrays.copyOfRange(nums, 1, nums.length));
}

}