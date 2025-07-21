import java.util.*;

class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        // Count frequencies
        Map<Integer, Integer> freq = new HashMap<>();
        for (int b : barcodes) freq.put(b, freq.getOrDefault(b, 0) + 1);

        // Priority queue: max heap by frequency
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int key : freq.keySet()) {
            pq.offer(new int[]{key, freq.get(key)});
        }

        int n = barcodes.length;
        int[] res = new int[n];
        int i = 0;

        while (!pq.isEmpty()) {
            int[] entry = pq.poll();
            int val = entry[0], count = entry[1];
            // Place val in every other slot while there's count left
            for (int j = 0; j < count; j++) {
                res[i] = val;
                i += 2;
                if (i >= n) i = 1; // When even slots filled, start filling odds
            }
        }
        return res;
    }
}
