class Solution {
    public int isFound(int target, int[] nums)
    {
        int n = nums.length;
        int left = 0,right =n-1;
        int mid = 0;

        while(left <= right)
        {
            mid = (left + right) / 2;

            if(nums[mid] == target)
            {
                return mid;
            }
            else if(target < nums[mid])
            {
                right = mid - 1;
                
            }

            else
            {
                left = mid + 1;
                 
            }


        }

        return left; // element not found

    }
    public int searchInsert(int[] nums, int target) {

        // time complexity should be O(log n) => binary search
        int n = nums.length;
        if(target < nums[0])
        {
            return 0;
        }

        else if (target > nums[n-1])
        {
            return n;
        }

        else
        {
            return isFound(target, nums);
        }
        
        
    }
}