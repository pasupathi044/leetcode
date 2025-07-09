class Solution {
    public int findPeakElement(int[] nums) {
       int s=0;
       int e=nums.length-1;
        // Edge case: single element
        if (e+1 == 1) return 0;
        
        // Check if the first element is a peak
        if (nums[0] > nums[1]) return 0;
        
        // Check if the last element is a peak
        if (nums[e] > nums[e - 1]) return e;

        // Binary search between indices 1 and n-2
         s = 1;
         e = nums.length - 2;

       while(s<=e){
        int mid=s+((e-s)/2);
        if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
            return mid;
        }
        else if(nums[mid]==nums[s]&&nums[mid]==nums[e]){
            return mid;
        }

         if(nums[mid]<nums[mid+1]&&nums[mid]>nums[mid-1]){
           s=mid+1;
        }
        
        else{
            e=mid-1;
        }
       } 

       return -1;
    }
}