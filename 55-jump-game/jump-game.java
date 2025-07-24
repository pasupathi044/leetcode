class Solution {
    public boolean canJump(int[] nums) {
        int max=0,l=nums.length,i=0;
        while(i<l){
            max=Math.max(max,i+nums[i]);
            if(max>=l-1){
                  return true;
            }
            else if(max==i){
                return false;
            }
           i++;
        }
        return false;
    }
}