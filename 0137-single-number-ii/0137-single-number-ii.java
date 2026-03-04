class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        // put the element to the map
       for(Integer ele : nums)
       {
        map.put(ele , map.getOrDefault(ele ,0) + 1 );
       }

       for(int i = 0 ;i<n ;i++)
       {
            if(map.get(nums[i]) == 1)
            {
                return nums[i];
            }
       }
        return -1;
    }
}