class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max = 0;
        ArrayList<Boolean> answer = new ArrayList();
        for(int i=0;i<n;i++){
           max=Math.max(max,candies[i]);
        }

        for(int i:candies){
           if(i+extraCandies >= max){
            answer.add(true);
           }
           else{
           answer.add(false);
           }
        }
        return answer;
    }
}