class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int n:nums){
         map.put(n,map.getOrDefault(n,0)+1);
        }

        List<Integer> [] bucket = new List[nums.length+1];

        for(int val:map.keySet()){
            int freq = map.get(val);
            if(bucket[freq]==null){
               bucket[freq] = new ArrayList();
            }
            bucket[freq].add(val);
        }
        int[] res = new int[k];
        int counter =0;
        for(int pos = bucket.length-1;pos >=0 && counter< k ;pos--){
               if(bucket[pos]!=null){
                    for(int i:bucket[pos]){
                        res[counter]=i;
                        counter++;
                    }
               }
        }
        return res;
    }
}