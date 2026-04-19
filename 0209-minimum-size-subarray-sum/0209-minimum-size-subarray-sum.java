class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //using variable sliding window
        int sum =0, minlen = Integer.MAX_VALUE, len =0;
        int left = 0, right =0;

        for(right = 0; right < nums.length; right++)
        {
            sum += nums[right];

            while (target <= sum) //remove left element
            {
                    
                    //find the min lenght
                    minlen = Math.min(minlen, right - left +1);
                    
                    sum-=nums[left];
                    left++;
            }

        }

        return  (minlen == Integer.MAX_VALUE)?0 : minlen;
    }
}