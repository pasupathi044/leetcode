class Solution {
    public int findLucky(int[] arr) {
      int[] freq = new int [600];
       for(int num:arr){
        freq[num]++;
       }
       int ans = -1;
for (int i = 1; i < freq.length; i++) {
    if (freq[i] == i) {
        ans = i;
    }
}

       return ans;

    }
}