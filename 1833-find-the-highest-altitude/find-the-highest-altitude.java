class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        max=Math.max(max,gain[0]);
        int pnt = gain[0];
        for(int i=1;i<gain.length;i++){
            pnt = pnt +gain[i];
            max=Math.max(max,pnt);
        }
        return max;
    }
}