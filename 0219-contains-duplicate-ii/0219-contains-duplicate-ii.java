class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // using set for Time Complexity O(n)
        
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        
        //using sliding window
        
        for(int i=0 ;i<n;i++)
        {
            
            if(set.contains(nums[i]))
            {
                return true;
            }

        set.add(nums[i]);
        if(set.size() > k)
        {
           //remove the element
           set.remove(nums[i-k]);
        }

        }

        
        return false;

    }
}