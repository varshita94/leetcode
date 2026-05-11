class Solution {
    public int[] findErrorNums(int[] nums) {
        //using a hash map
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int[] ans = new int[2];

        for(int i = 1; i <= n;i++)
        {
            map.put(i,0);
        }

        for(int ele : nums)
        {
            map.put(ele, map.getOrDefault(ele,0)+1);
        }

        for(int ele : map.keySet())
        {
            if(map.get(ele) == 2)
            {
                ans[0] = ele;
            }
            if(map.get(ele) == 0)
            {
                ans[1] = ele;
            }
        }
        return ans;
    }
}