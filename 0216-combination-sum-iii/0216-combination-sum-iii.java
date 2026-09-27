class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        int[] arr = new int[9];
        for(int i = 0; i < 9; i++) {
            arr[i] = i + 1;
        }
        helper(k, n, arr, outer, inner, 0, 0);
        return outer;
    }

    public void helper(int k, int n, int[] arr, List<List<Integer>> outer, ArrayList<Integer> inner, int idx, int sum) {
        if(idx == arr.length) {
            if(sum == n && inner.size() == k) {
                outer.add(new ArrayList<>(inner));
            }
            return;
        }

        inner.add(arr[idx]);
        helper(k, n, arr, outer, inner, idx + 1, sum + arr[idx]);
        inner.remove(inner.size() - 1);

        helper(k, n, arr, outer, inner, idx + 1, sum);
    }
}