import java.util.*;

class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length, m = moveTime[0].length;
        int[][][] dist = new int[n][m][2]; // [i][j][parity]
        for (int[][] arr2d : dist)
            for (int[] arr1d : arr2d)
                Arrays.fill(arr1d, Integer.MAX_VALUE);
        dist[0][0][0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 0, 0, 0}); // {time, i, j, parity}

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int time = curr[0], i = curr[1], j = curr[2], parity = curr[3];
            if (i == n-1 && j == m-1)
                return time;
            if (dist[i][j][parity] < time)
                continue;
            for (int[] d : dirs) {
                int ni = i + d[0], nj = j + d[1];
                if (ni < 0 || ni >= n || nj < 0 || nj >= m)
                    continue;
                int moveCost = (parity == 0) ? 1 : 2;
                int start = Math.max(time, moveTime[ni][nj]);
                int arrive = start + moveCost;
                int nextParity = 1 - parity;
                if (arrive < dist[ni][nj][nextParity]) {
                    dist[ni][nj][nextParity] = arrive;
                    pq.offer(new int[]{arrive, ni, nj, nextParity});
                }
            }
        }
        return -1; // unreachable, per constraints this won't happen
    }
}
