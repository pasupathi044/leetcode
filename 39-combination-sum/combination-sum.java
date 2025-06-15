class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> fin = new ArrayList<>();
        List<Integer> arr= new ArrayList<>();
        int idx=0;
        int sum=target;
        sum(idx,candidates,sum,fin,arr);
        return fin;
    }
    static void  sum(int idx,int[] candidates,int sum,List<List<Integer>> fin,List<Integer> arr){
        if( sum<0 || idx==candidates.length){
            if(sum==0){
                fin.add(new ArrayList<>(arr));
            }
            return;
        }
        arr.add(candidates[idx]);
        sum(idx,candidates,sum-candidates[idx],fin,arr);
        arr.remove(arr.size()-1);
        sum(idx+1,candidates,sum,fin,arr);
    }
}