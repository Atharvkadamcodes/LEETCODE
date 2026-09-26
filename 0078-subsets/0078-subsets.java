class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> inner = new ArrayList<>();
        helper(nums, list, inner, 0);
        return list;
    }
    
    public void helper(int[] nums, List<List<Integer>> list, ArrayList<Integer> inner, int idx) {
        if(idx == nums.length) {
            list.add(new ArrayList(inner));
            return;
        }
        
        inner.add(nums[idx]);
        helper(nums, list, inner, idx + 1);

        inner.remove(inner.size() - 1);
        
        helper(nums, list, inner, idx + 1);
    }
}