class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            if (hm.containsKey(num)) {
                int count = hm.get(num) + 1;
                hm.put(num, count);
            } else {
                hm.put(num, 1);
            }

            if (hm.get(num) > nums.length / 3) {
                set.add(num);
            }
        }
        
        for (int num : set) {
            list.add(num);
        }

        return list;
    }
}