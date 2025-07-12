class Solution {
    public int trap(int[] height) {
        int[]leftMax = new int[height.length]; 
        int[]rightMax = new int [height.length];
        int total=0;
        // left max array 
        leftMax[0]=height[0];
        for(int i=1;i< height.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        } 

        // right max array 
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        } 

        //find the total puddle
        for(int i=0;i<height.length;i++){
            if(height[i]<leftMax[i] && height[i]<rightMax[i]){
                total+=Math.min(leftMax[i],rightMax[i])-height[i];
            }
        }

        return total;
    }
}