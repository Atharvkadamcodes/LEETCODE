class Solution {
    ArrayList<List<Integer>> outer = new ArrayList<>();

    public void subset2(ArrayList<Integer> list, int i, ArrayList<Integer> ans) {
        //base case
        if(i == list.size()) {
            if(!outer.contains(ans)) {
                outer.add(new ArrayList<>(ans));
            }
            return;
        }

        //recurrsion
        ans.add(list.get(i));
        subset2(list, i + 1, ans);

        //backtracking
        ans.remove(ans.size() - 1);
        subset2(list, i + 1, ans);
        
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int num : nums) {
            list.add(num);
        }

        subset2(list, 0, new ArrayList<>());
        return outer;
    }
}