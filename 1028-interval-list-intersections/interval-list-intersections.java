class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> solution = new ArrayList<>();
        int idx1 =0;
        int idx2=0;
        while(idx1<firstList.length&&idx2<secondList.length){

            int start = Math.max(firstList[idx1][0],secondList[idx2][0]);
            int end = Math.min(firstList[idx1][1],secondList[idx2][1]);
            if(start<=end){
                solution.add(new int []{start,end});
            }
            if(firstList[idx1][1] < secondList[idx2][1]){
                    idx1++;
            }
            else{
                idx2++;
            }
        }
        return solution.toArray(new int[solution.size()][]);

    }
}