class Solution {
    ArrayList<List<Integer>> outer = new ArrayList<>();

    public void subset(List<Integer> nums, List<Integer> ans, int i) {
        //base case
        if(i == nums.size()) {
            outer.add(new ArrayList<>(ans));
            return;
        }

        //recursion
        ans.add(nums.get(i));
        subset(nums, ans, i + 1);

        ans.remove(ans.size() - 1);

        subset(nums, ans, i + 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);

        subset(list, new ArrayList<>(), 0);
        return outer;
    }
}