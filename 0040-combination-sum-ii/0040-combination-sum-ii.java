class Solution {
    List<List<Integer>> outer = new ArrayList<>();

    public void sum(int[] candidates, int target, List<Integer> ans, int sum, int i) {
        //base case
        if(sum == target) {
            outer.add(new ArrayList<>(ans));
            return;
        }

        //recursion
        for(int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1]) continue;

            if(sum + candidates[j] > target) break;

            ans.add(candidates[j]);
            sum(candidates, target, ans, sum + candidates[j], j + 1);

            ans.remove(ans.size() - 1);

        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        sum(candidates, target, new ArrayList<>(), 0, 0);
        return outer;
    }
}