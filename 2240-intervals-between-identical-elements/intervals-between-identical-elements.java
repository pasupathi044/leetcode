class Solution {
    public long[] getDistances(int[] arr) {
    Map<Integer, List<Integer>> m = new HashMap();
    long[] res = new long[arr.length];
    for (int i = 0; i < arr.length; i++) {
        if (!m.containsKey(arr[i])) m.put(arr[i], new ArrayList());
        m.get(arr[i]).add(i);
    }
    for (int x: m.keySet()) {
        List l = m.get(x);
        long[] pre = new long[l.size() + 1];
        for (int i = 0; i < l.size(); i++)
            pre[i + 1] = pre[i] + (int)l.get(i);
        for (int i = 0; i < l.size(); i++) {
            long v = (long)(int)l.get(i);
            res[(int)l.get(i)] = (v * (i + 1) - pre[i + 1]) 
                + ((pre[l.size()] - pre[i]) - v * (l.size() - (i)));
            }
    }
    return res;
}
}