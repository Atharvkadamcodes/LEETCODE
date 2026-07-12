class Solution {
    List<List<Integer>> outer = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<Integer>[] list = new ArrayList[graph.length];
        boolean[] vis = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < graph.length; i++) {
            for (int neigh : graph[i]) {
                list[i].add(neigh);
            }
        }

        
        allPathsSourceTargetUtil(list, 0, graph.length - 1, new ArrayList<>());

        return outer;
    }

    public void allPathsSourceTargetUtil(ArrayList<Integer>[] list, int curr, int dest, List<Integer> inner) {
        inner.add(curr);

        if(curr == dest) {
            outer.add(new ArrayList<>(inner));
            return; 
        }

        for(int i = 0; i < list[curr].size(); i++) {
            int neigh = list[curr].get(i);
            allPathsSourceTargetUtil(list, neigh, dest, inner);
            inner.remove(inner.size() - 1);
        }
    }
}