class Solution {
    ArrayList<List<Integer>> outer = new ArrayList<>();

    public void sum(List<Integer> candidates,List<Integer> ans, int target, int sum, int i) {
        //base case
        if(sum == target) {

            outer.add(new ArrayList<>(ans));
            return;
        } else if(sum > target || i == candidates.size()) {
            return;
        }

        //recursion
        ans.add(candidates.get(i));
        sum(candidates, ans, target, sum + candidates.get(i), i);

        //backtracking
        ans.remove(ans.size() - 1);

        sum(candidates, ans, target, sum, i + 1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        for (int candidate : candidates) list.add(candidate);

        sum(list, new ArrayList<>(), target, 0, 0);

        return outer;
    }
}