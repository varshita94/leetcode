class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = 0, second = 0;
        //let's try adding the nums2 ele into the 
        //empty places of nums1 first
        int j = 0;
        int len = nums1.length;
       for(first = m; first < len;first++)
       {
            nums1[first] = nums2[j];
            j++;
       }
       Arrays.sort(nums1);
    }
}