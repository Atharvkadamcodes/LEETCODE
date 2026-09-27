class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        helper(candidates, target, outer, inner, 0, 0);
        return outer;
    }

    public void helper(int[] candidates, int target, List<List<Integer>> outer, ArrayList<Integer> inner, int idx, int sum) {
        if(sum == target) {
            outer.add(new ArrayList<>(inner));
            return;
        } else if(sum > target || idx == candidates.length) {
            return;
        }

        inner.add(candidates[idx]);
        helper(candidates, target, outer, inner, idx, sum + candidates[idx]);
        inner.remove(inner.size() - 1);

        helper(candidates, target, outer, inner, idx + 1, sum);
    }
}