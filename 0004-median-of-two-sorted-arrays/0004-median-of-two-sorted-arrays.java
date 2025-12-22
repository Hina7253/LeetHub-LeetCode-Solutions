class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }

        while (i < n) arr[k++] = nums1[i++];
        while (j < m) arr[k++] = nums2[j++];

        int len = n + m;

        if (len % 2 == 0) {
            return (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        } else {
            return arr[len / 2];
        }
    }
}
