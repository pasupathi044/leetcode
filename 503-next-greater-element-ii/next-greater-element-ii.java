class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack <Integer> st = new Stack<>();
        int[]solution = new int [nums.length];
        int l=nums.length;
        for(int i= (2*nums.length-1);i>=0;i--){
            while (!st.isEmpty()&&nums[i%l]>=st.peek()){
                st.pop();
            }
            if(i<l){
            if(st.isEmpty()){
                solution[i] = -1;
            }
            else {
                solution[i]=st.peek();
            }
            }
            st.push(nums[i%l]);
        }
        return solution;
    }
}