class Solution {

    public void reverse(int arr[], int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            r--;
            l++;
        }
    }

    public void rotate(int[] nums, int k) {
        // first reverse the array
        int n = nums.length;
        if(n == 1){return;}
                k = k % n;   
        reverse(nums, 0, n-1);

        //now break the array at k

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

    }
}