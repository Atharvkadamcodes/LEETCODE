class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int i = 1;

        for(int x : target) {
            while(i < x) {
                list.add("Push");
                list.add("Pop");
                i++;
            }

            list.add("Push");
            i++;
        }

        return list;
    }
}