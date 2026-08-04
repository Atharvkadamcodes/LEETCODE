class Solution {
    class Node {
        int start;
        int end;

        public Node(int s, int e) {
            this.start = s;
            this.end = e;
        }
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<Node> list = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                list.add(new Node(start, end));
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        list.add(new Node(start, end));

        int arr[][] = new int[list.size()][2];

        for(int i = 0; i < list.size(); i++) {
            Node node = list.get(i);
            arr[i][0] = node.start;
            arr[i][1] = node.end;
        }

        return arr;
    }
}