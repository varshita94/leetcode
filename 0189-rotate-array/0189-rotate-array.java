class Solution {
    void reverse(int arr[], int i, int j)
    {
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n == 1) return;
        k = k % n;
        //reverse the whole array
        reverse(nums, 0, n - 1);
        //reverse the second part
        
        reverse(nums, 0, k - 1 );
        reverse(nums, k , n - 1);
    }
}