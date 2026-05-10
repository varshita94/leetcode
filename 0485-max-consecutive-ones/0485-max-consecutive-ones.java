class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int left = 0, right  =0;
        int max = 0;

        for(right = 0; right < n; right++)
        {
            if(nums[right] == 1)
            {
                //increment count
                count++;
                max = Math.max(max, count);
            }
            else
            {
                left = right+1;
                count = 0;
            }
        }
        return max;
    }
}