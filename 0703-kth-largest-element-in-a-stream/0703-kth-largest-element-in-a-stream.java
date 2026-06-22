class KthLargest {
    PriorityQueue<Integer> KthLargest;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        KthLargest = new PriorityQueue<>();
        
        for(int i = 0; i < nums.length; i++) {
            KthLargest.add(nums[i]);

            if (KthLargest.size() > k) {
                KthLargest.poll();
            }
        }
    }
    
    public int add(int val) {
        KthLargest.add(val);

        if(KthLargest.size() > k) {
            KthLargest.remove();
        }

        return KthLargest.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */