class Pair{
    int node;
    int distance;
    public Pair(int node, int distance){
        this.node = node;
        this.distance = distance;
    }
}
class Solution {
    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
        //create a graph
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int len = edge[2];
            adj.get(u).add(new Pair(v,len));
            adj.get(v).add(new Pair(u,len));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.distance-b.distance);
        int [] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int dis = p.distance;
            int node = p.node;
            if(dis>dist[node])continue;
            for(Pair neighbor : adj.get(node)){
                int adjnode = neighbor.node;
                int adjdist = neighbor.distance;
                if(disappear[adjnode]>adjdist+dis&&adjdist+dis<dist[adjnode]){
                    dist[adjnode]= adjdist+dis;
                    pq.add(new Pair(adjnode,dist[adjnode]));
                }
            }
        }
        for(int i=0;i<n;i++){
            if(dist[i]>disappear[i]||dist[i]==Integer.MAX_VALUE){
                dist[i]=-1;
            }
        }
        return dist;
    }
}