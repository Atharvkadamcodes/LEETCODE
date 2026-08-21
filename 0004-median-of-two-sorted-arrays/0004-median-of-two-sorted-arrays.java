class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];

        for(int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }

        int i = nums1.length - 1;
        int j = nums2.length - 1;
        int k = arr.length - 1;

        while(j >= 0) {
            if(i >= 0 && arr[i] > nums2[j]) {
                arr[k] = arr[i];
                k--;
                i--;
            } else {
                arr[k] = nums2[j];
                k--;
                j--;
            }
        }

        int start = 0;
        int end = arr.length - 1;

        int mid = arr.length / 2;

        if(arr.length % 2 != 0) {
            return arr[mid];
        }

        return (arr[mid - 1] + arr[mid]) / 2.0;
    }
}