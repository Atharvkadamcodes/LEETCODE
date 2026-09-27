class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        List<List<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        helper(list, outer, inner, nums.length);
        return outer;
    }

    public void helper(ArrayList<Integer> list, List<List<Integer>> outer, ArrayList<Integer> inner, int len) {
        if(inner.size() == len) {
            outer.add(new ArrayList<>(inner));
            return;
        }

        for(int i = 0; i < list.size(); i++) {
            int val = list.remove(i);
            inner.add(val);
            helper(list, outer, inner, len);
            inner.remove(inner.size() - 1);
            list.add(i, val);
        }
    }
}