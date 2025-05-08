import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;
        
        int[][] dist = new int[n][m];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, 0, 0}); // [time, i, j]
        
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int time = curr[0], i = curr[1], j = curr[2];
            
            if (i == n - 1 && j == m - 1) {
                return time;
            }
            
            if (time > dist[i][j]) {
                continue;
            }
            
            for (int[] dir : dirs) {
                int x = i + dir[0];
                int y = j + dir[1];
                
                if (x < 0 || x >= n || y < 0 || y >= m) {
                    continue;
                }
                
                int startTime = Math.max(time, moveTime[x][y]);
                int newTime = startTime + 1;
                
                if (newTime < dist[x][y]) {
                    dist[x][y] = newTime;
                    pq.offer(new int[]{newTime, x, y});
                }
            }
        }
        
        return -1; // The problem states it's always reachable, so this line is just a fallback.
    }
}
