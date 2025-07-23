class Solution {
    public int findKOr(int[] nums, int k) {
        
        int ans=0;
        for(int i=0; i<32; i++){
            int cnt=0;
            for(int j:nums){
                if((1&(j>>i))==1){
                    cnt++;
                }
            }
            if(cnt>=k){
                ans|=ans|1<<i;
            }
            
        }
        return ans;
    }
}