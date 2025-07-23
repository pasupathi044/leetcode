class Solution {
    public List<String> stringMatching(String[] words) {
        HashSet<String> answer = new HashSet();
        for(String string1:words){
            for(String string2:words){
                if(!string1.equals(string2) && string1.contains(string2)){
                    answer.add(string2);
                }
            } 
       }
       return new ArrayList<>(answer);
    }
}