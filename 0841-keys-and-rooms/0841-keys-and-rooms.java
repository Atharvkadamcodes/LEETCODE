class Solution {
    class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        ArrayList<Edge>[] graph = new ArrayList[rooms.size()];

        for (int i = 0; i < rooms.size(); i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < rooms.size(); i++) {
            List<Integer> room = rooms.get(i);
            for(int j = 0; j < room.size(); j++) {
                Edge e = new Edge(i, room.get(j));
                graph[i].add(e);
            }
        }

        boolean vis[] = new boolean[rooms.size()];

        dfs(graph, 0, vis);

        for(int i = 0; i < vis.length; i++) {
            if(!vis[i]) {
                return false;
            }
        }

        return true;
    }
}