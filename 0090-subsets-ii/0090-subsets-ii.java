class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        helper(nums, outer, inner, 0);
        return outer;
    }

    public void helper(int[] nums, List<List<Integer>> outer, ArrayList<Integer> inner, int idx) {
        if(idx == nums.length) {
            if(!outer.contains(inner)) {
                outer.add(new ArrayList<>(inner));
            }
            return;
        }

        inner.add(nums[idx]);
        helper(nums, outer, inner, idx + 1);
        inner.remove(inner.size() - 1);

        helper(nums, outer, inner, idx + 1);
    }
}