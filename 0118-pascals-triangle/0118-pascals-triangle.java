class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            int value = 1;
            if(i == 0) {
                ArrayList<Integer> row = new ArrayList<>();
                row.add(1);
                ans.add(new ArrayList<>(row));
            } else if(i == 1) {
                ArrayList<Integer> row = new ArrayList<>();
                for(int j = 0; j <= i; j++) {
                    row.add(1);
                }
                ans.add(new ArrayList<>(row));
            } else {
                List<Integer> list = ans.get(i - 1);
                ArrayList<Integer> row = new ArrayList<>();
                row.add(1);
                for(int j = 0; j < list.size() - 1; j++) {
                    int a = list.get(j);
                    int b = list.get(j + 1);
                    int sum = a + b;
                    row.add(sum);
                }
                row.add(1);
                ans.add(new ArrayList<>(row));
            }  
        }
        return ans;
    }
}