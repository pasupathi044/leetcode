class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>> fin = new ArrayList<>();
        List<Integer> arr= new ArrayList<>();
        int[] candidates = {1,2,3,4,5,6,7,8,9};
        int idx=0;
        int sum=n;
        int midx=k;
        sum(idx,midx,candidates,sum,fin,arr);
        return fin;
    }

static void  sum(int idx,int midx,int[] candidates,int sum,List<List<Integer>> fin,List<Integer> arr){
         if(idx==candidates.length){
            if((arr.size()==midx) && sum==0){
                fin.add(new ArrayList<>(arr));
            }
            return;
        }
      
        arr.add(candidates[idx]);
        sum(idx+1,midx,candidates,sum-candidates[idx],fin,arr);
        arr.remove(arr.size()-1);
        sum(idx+1,midx,candidates,sum,fin,arr);
    }
}
