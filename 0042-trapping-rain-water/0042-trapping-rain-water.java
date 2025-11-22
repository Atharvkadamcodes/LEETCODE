class Solution {
    public int trap(int[] height) {
        int LMB[] = new int[height.length];
        int RMB[] = new int [height.length];
        
        if(height.length <= 2) {
            return 0;
        }

        boolean same = true;
        for(int i = 1; i < height.length; i++) {
            if(height[i] != height[i - 1]) {
                same = false;
                break;
            }
        }

        if(same) {
            return 0;
        }

        for(int i = 0; i < height.length; i++) {
            int largestLB = Integer.MIN_VALUE;
            for(int j = 0; j <= i; j++) {
                if(largestLB < height[j]) {
                    largestLB = height[j];
                }
            }
            LMB[i] = largestLB;
        }

        for(int i = height.length - 1; i >= 0; i--) {
            int largestRB = Integer.MIN_VALUE;
            for(int j = i; j < height.length; j++) {
                if(largestRB < height[j]) {
                    largestRB = height[j];
                }
            }
            RMB[i] = largestRB;
        }

            int result = 0;
            for(int i = 0; i < height.length; i++) {
                int WL = Math.min(RMB[i], LMB[i]);
                int TW = WL - height[i];
                result = result + TW;
            }
            return result;
    
    }
}