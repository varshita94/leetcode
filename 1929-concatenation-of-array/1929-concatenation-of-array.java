class Solution {
    public int[] getConcatenation(int[] nums) {
        //using brute force approach
        int n = nums.length;
        int j = 0;
        int[] ans = new int[2*n];

        for(int i = 0; i < n ;i++)
        {
            ans[i] = nums[i];
        }

        for(int i = n ;i< 2*n ;i++)
        {
            ans[i] = nums[j];
            j++;
        }


        return ans;
    }
}