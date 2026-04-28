class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int i = 0;
        int jump = 0;

        for(i= 0 ; i< n;i++)
        {
            if(i > jump)
            {
                return false;
            }
            jump = Math.max(jump, i+nums[i]);

           
        }
         if(i >= n)
            {
                return true;
            }
            return false;
    }
}