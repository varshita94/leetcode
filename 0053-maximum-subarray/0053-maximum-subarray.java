class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = nums[0];

        for(int n : nums)
        {
            currSum = Math.max(currSum,0); //if the element is -ve then take 0
            currSum += n;
            maxSum = Math.max(maxSum, currSum);

        }

        return maxSum;

    }
}