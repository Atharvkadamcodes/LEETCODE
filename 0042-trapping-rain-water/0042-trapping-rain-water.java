class Solution {
    public int trap(int[] height) {
        
        
        if(height.length <= 2) {
            return 0;
        }

        boolean asc = true;
        for(int i = 1; i < height.length; i++) {
            if(height[i] < height[i - 1]) {
                asc = false;
                break;
            }
        }

        boolean desc = true;
        for(int i = 1; i < height.length; i++) {
            if(height[i] > height[i - 1]) {
                desc = false;
                break;
            }
        }

        boolean same = true;
        for(int i = 1; i < height.length; i++) {
            if(height[i] != height[i - 1]) {
                same = false;
                break;
            }
        }

        if(asc || desc ||same) {
            return 0;
        }

        int LMB[] = new int[height.length];
        LMB[0] = height[0];
        
        for(int i = 1; i < height.length; i++) {
            LMB[i] = Math.max(height[i], LMB[i - 1]);
        }

        int RMB[] = new int [height.length];
        RMB[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--) {
            RMB[i] = Math.max(height[i], RMB[i + 1]);
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