class Solution {

    ArrayList<List<Integer>> outer = new ArrayList<>();

    public void permutation(List<Integer> nums, List<Integer> ans) {

        // base case
        if (nums.size() == 0) {
            outer.add(new ArrayList<>(ans));
            return;
        }

        // recursion
        for (int i = 0; i < nums.size(); i++) {
            int curr = nums.get(i);

            List<Integer> newNums = new ArrayList<>(nums);
            newNums.remove(i);

            ans.add(curr);
            permutation(newNums, ans);
            ans.remove(ans.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        outer.clear();

        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);

        permutation(list, new ArrayList<>());
        return outer;
    }
}
