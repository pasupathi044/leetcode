class Solution {
    public List<Integer> findPeaks(int[] mountain) {
            int n=mountain.length-1;
            List <Integer> sol = new ArrayList<>();
            for(int i=1;i<=n-1;i++){
                if(mountain[i]>mountain[i-1]&&mountain[i]>mountain[i+1]){
                    sol.add(i);
                }                               
            }
            return sol;
    }
}