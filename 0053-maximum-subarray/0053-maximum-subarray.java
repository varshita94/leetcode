class Solution {
    public int maxSubArray(int[] nums) {
       //kadane's algorithm

       int currentSum = nums[0];
       int maxSum = nums[0];
        int n= nums.length;
       for(int i=1 ;i<n;i++)
       {
        currentSum = Math.max(nums[i], currentSum+nums[i]);  //remove adding with the negatives
        maxSum = Math.max(maxSum,currentSum);

       }

       return maxSum;

    }
}