class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //putting the number and the count of the number in the map
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int majority = 0;
        for(int i=0; i<n;i++)
        {
            if(map.get(nums[i]) > n/2)
            {
                majority = nums[i];
            }
        }
        return majority;
            }
}