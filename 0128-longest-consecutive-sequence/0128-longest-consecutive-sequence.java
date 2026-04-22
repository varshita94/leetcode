class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        Arrays.sort(nums);
        //using two pointers

       
        int len = 1, max = 1;

        for(int i =1; i<nums.length;i++)
        {
            //ignore duplicate 
            if(nums[i] == nums[i-1])
            {
                continue;
            }
            else if(nums[i] - nums[i-1] == 1)
            {
                len += 1;
                
            }
            else
            {
                len = 1;
             

            }
           max =  Math.max(max, len);
        }
        return max;
    }
}