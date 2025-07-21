class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int [][]answer = new int [matrix.length][matrix[0].length];
        for(int i=0;i<answer.length;i++){
            for(int j=0;j<answer[0].length;j++){
                answer[i][j]=matrix[i][j];
            }
        }

        for(int j=0;j<matrix[0].length;j++){
            int max=0;
            for(int i=0;i<matrix.length;i++){
                  max=Math.max(max,matrix[i][j]);
            }
            for(int i=0;i<matrix.length;i++){
                  if(matrix[i][j]==-1){
                    answer[i][j]=max;
                  }
            }
        }

        return answer;
    }
}