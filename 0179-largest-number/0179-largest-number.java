class Solution {
    public String largestNumber(int[] nums) {
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i < nums.length - 1; i++) {
        //     int smallest = i;
        //     for(int j = i + 1; j < nums.length; j++) {
        //         if(nums[smallest] > nums[j]) {
        //             smallest = j;
        //         }
        //         int temp = nums[smallest];
        //         nums[smallest] = nums[i];
        //         nums[i] = temp;
        //     }
        // }
        
        // for(int j = 0; j < nums.length; j++) {
        //     sb.append(nums[j]);
        // }

        // return sb.toString();

        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.toString(nums[i]);
        }

        for(int i = 0; i < nums.length - 1; i++) {
            int smallest = i;
            for(int j = i + 1; j < nums.length; j++) {
                String ab = arr[smallest] + arr[j];
                String ba = arr[j] + arr[smallest];
                if(ab.compareTo(ba) < 0) {
                    smallest = j;
                }
            }
            String temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}