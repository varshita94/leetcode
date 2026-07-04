class Solution {
    public int removeDuplicates(int[] nums) {
        int  n = nums.length;
        int max = nums[n-1];
        int left = 0, right = 1;
        int count = 1;
        int pos = 0;;
        for(left = 0; left < n;left ++)
        {
            //store the org position
            pos = left + 1;
            right = left + 1;
            while(right < n )
            {
                if(nums[right] > nums[left])
                {
                    nums[pos] = nums[right];
                    
                    break;
                }
                right++;
            }

            


        }

        for(int i =0 ; i < n;i++)
            {
                if(nums[i] == max)
                {
                    break;
                }
                count++;
            }

        return count;
    }
}