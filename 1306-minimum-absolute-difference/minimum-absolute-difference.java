class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n=arr.length;
        List<List<Integer>> answer = new ArrayList();
        Arrays.sort(arr);
        int min =Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
              int diff= arr[i]-arr[i-1];
              min=Math.min(diff,min);
        }
        
        for(int i=1;i<n;i++){
              int diff= arr[i]-arr[i-1];
              if(diff==min){
                answer.add(Arrays.asList(arr[i - 1], arr[i]));
              }
        }

       return answer;
    }
}