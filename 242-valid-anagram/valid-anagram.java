class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hash = new HashMap<>();

        for(char m:s.toCharArray()){
             hash.put(m,hash.getOrDefault(m,0)+1);
        }
        boolean op = true;
        for(char m:t.toCharArray()){
             if(!hash.containsKey(m)||hash.get(m) == 0) op = false;
             hash.put(m,hash.getOrDefault(m,0)-1);
        }
        return op;
    }
}